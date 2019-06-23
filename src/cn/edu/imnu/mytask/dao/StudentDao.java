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
		int tags = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT login_id FROM tb_applicant WHERE login_id = ? and login_password = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next())
				applicantID = rs.getInt("applicant_id");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeJDBC(rs, pstmt, conn);
		}
		return applicantID;
	}
}
