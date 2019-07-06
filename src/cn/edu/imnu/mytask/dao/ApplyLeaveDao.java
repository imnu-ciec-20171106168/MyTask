package cn.edu.imnu.mytask.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import cn.edu.imnu.mytask.bean.ApplyLeaveBean;
import cn.edu.imnu.mytask.util.DBUtil;
public class ApplyLeaveDao {
	@SuppressWarnings("resource")
	public  int add(ApplyLeaveBean applyleave, int applicantID) { 
		// TODO Auto-generated method stub
		int leaverecordID=0;
		String sql="insert into tb_leaverecord(realnumber,realname,realgrade,starttime,endtime,telephone,operate1,operate2,leavereason,student_id)VALUES(?,?,?,?,?,?,?,?,?,?)";
		String sql2 = "SELECT leaverecord_id FROM tb_leavrecord WHERE student_id = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, applyleave.getRealNumber());
			pstmt.setString(2, applyleave.getRealName());
			pstmt.setString(3, applyleave.getRealGrade());
			//pstmt.setTimestamp(4, applyleave.getStartTime()==null?null:new Timestamp(((Timestamp) applyleave.getStartTime()).getTime()));
			//pstmt.setTimestamp(5, applyleave.getEndTime()==null?null:new Timestamp(((Timestamp) applyleave.getEndTime()).getTime()));
			pstmt.setDate(4, applyleave.getStartTime());
			pstmt.setDate(5, applyleave.getEndTime());
			pstmt.setString(6, applyleave.getTelephone());
			pstmt.setString(7, applyleave.getOperate1());
			pstmt.setString(8, applyleave.getOperate2());
			pstmt.setString(9, applyleave.getLeaveReason());
			pstmt.setInt(10, applicantID);
			pstmt.executeUpdate();	

			
			/*ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				leaverecordID = rs.getInt(1);
			*/conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			DBUtil.closeJDBC(null, pstmt, conn);
		}
		return leaverecordID;
	}
	
	public List<ApplyLeaveBean> selectApplyLeaveByID(int applicantID) {
		List <ApplyLeaveBean> list = new ArrayList<ApplyLeaveBean>();
		ApplyLeaveBean applyleave = new ApplyLeaveBean();
		String sql = "SELECT * FROM tb_leaverecord WHERE student_id = ?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, applicantID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				applyleave.setRealNumber(rs.getString("realnumber"));
				applyleave.setRealName(rs.getString("realname"));
				applyleave.setRealGrade(rs.getString("realgrade"));
				applyleave.setStartTime(rs.getDate("starttime"));
				applyleave.setEndTime(rs.getDate("endtime"));
				applyleave.setTelephone(rs.getString("telephone"));
				applyleave.setOperate1("operate1");
				applyleave.setOperate2("operate2");
				applyleave.setLeaveReason(rs.getString("leavereason"));
			}
			DBUtil.closeJDBC(null, pstmt, conn);
			return list;
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		} finally {			
		}
		return null;
	}
	
	public void saveLeaveInfo(String realnumber, String realname, String realgrade, String starttime, String endtime, String telephone, String operate1, String operate2, String leavereason, int studentid) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_leaverecord(realnumber,realname,realgrade,starttime,endtime,telephone,operate1,operate2,leavereason,student_id)VALUES(?,?,?,?,?,?,?,?,?,?)";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;	
		ApplyLeaveBean applyleave = new ApplyLeaveBean();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, realnumber);
			pstmt.setString(2, realname);
			pstmt.setString(3, realgrade);
			pstmt.setString(4, starttime);
			pstmt.setString(5, endtime);
			pstmt.setString(6, telephone);
			pstmt.setString(7, operate1);
			pstmt.setString(8, operate2);
			pstmt.setString(9, leavereason);
			pstmt.setInt(10, studentid);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeJDBC(null, pstmt, conn);
		}
	}
	
	public ArrayList<ApplyLeaveBean> getAllApplyLeaveInfo(){
		DBUtil dbu = new DBUtil();
		Connection conn = dbu.getConnection();
		ArrayList<ApplyLeaveBean> applyleaves = new ArrayList<>();
		String sql = "SELECT tb_leaverecord.REALNUMBER, realname, realgrade,starttime, endtime,telephone,operate1,operate2,leavereason" + 
				"FROM tb_leaverecord lEFT OUTER JOIN tb_student on tb_leaverecord.REALNUMBER=tb_student.STUDENT_NUMBER" + 
				"WHERE realnumber=20171106168";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			rs.last();
			rs.beforeFirst();
			while(rs.next()) {
				ApplyLeaveBean applyleave = new ApplyLeaveBean();
				applyleave.setRealNumber(rs.getString("realnumber"));
				applyleave.setRealNumber(rs.getString("realname"));
				applyleave.setRealNumber(rs.getString("starttime"));
				applyleave.setRealNumber(rs.getString("endtime"));
				applyleave.setRealNumber(rs.getString("telephone"));
				applyleave.setRealNumber(rs.getString("operate1"));
				applyleave.setRealNumber(rs.getString("operate2"));
				applyleave.setRealNumber(rs.getString("leavereason"));
				applyleaves.add(applyleave);			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return applyleaves;
		
	}
}
