package cn.edu.imnu.mytask.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import cn.edu.imnu.mytask.bean.ApplyLeaveBean;
import cn.edu.imnu.mytask.util.DBUtil;

public class ApplyLeaveDao {
	public  int add(ApplyLeaveBean applyleave, int applicantID) {
		// TODO Auto-generated method stub
		int leaverecordID=0;
		String sql="insert into tb_leaverecord(leaverecord_id,realnumber,realname,realgrade,starttime,endtime,telephone,leavereson,student_id)VALUES(?,?,?,?,?,?,?,?)";
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, applyleave.getRealNumber());
			pstmt.setString(2, applyleave.getRealName());
			pstmt.setString(3, applyleave.getRealGrade());
			pstmt.setTimestamp(4, applyleave.getStartTime()==null?null:new Timestamp(((Timestamp) applyleave.getStartTime()).getTime()));
			pstmt.setTimestamp(5, applyleave.getEndTime()==null?null:new Timestamp(((Timestamp) applyleave.getEndTime()).getTime()));
			pstmt.setString(6, applyleave.getTelephone());
			pstmt.setString(7, applyleave.getLeaveReason());
			pstmt.setInt(8, applicantID);
			pstmt.executeUpdate();
			
			String sql2 = "SELECT leaverecord_id FROM tb_leavrecord WHERE applicant_id = ?";
			pstmt = conn.prepareStatement(sql2);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				leaverecordID = rs.getInt(1);
			conn.commit();
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
}
