package cn.edu.imnu.mytask.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import cn.edu.imnu.mytask.util.DBUtil;

public class StudentDao {
	
	public int login(String email, String password) {
		// TODO Auto-generated method stub
		int applicantID = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmtID = null;
		ResultSet rs = null;
		String sql = "SELECT login_id FROM tb_login WHERE login_number = ? and login_password = ?";
		try {
			pstmtID = conn.prepareStatement(sql);
			pstmtID.setString(1, email);
			pstmtID.setString(2, password);
			rs = pstmtID.executeQuery();
			if (rs.next())
			{
				applicantID = rs.getInt("login_id");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeJDBC(rs, pstmtID, conn);
		}
		return applicantID;
	}
	
	public int logintag(String email, String password) {
		// TODO Auto-generated method stub
		int tags = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmtTAG = null;
		ResultSet rs = null;
		String sql = "SELECT login_tag FROM tb_login WHERE login_number = ? and login_password = ?";
		try {
			pstmtTAG = conn.prepareStatement(sql);
			pstmtTAG.setString(1, email);
			pstmtTAG.setString(2, password);
			rs = pstmtTAG.executeQuery();
			if(rs.next())
				tags = rs.getInt("login_tag");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.closeJDBC(rs, pstmtTAG, conn);
		}
		return tags;
	}

}


