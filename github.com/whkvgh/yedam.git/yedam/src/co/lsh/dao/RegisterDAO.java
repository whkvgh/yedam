package co.lsh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class RegisterDAO {
	DataSource ds;
	Connection conn =null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public RegisterDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<RegisterDAO> membercheck(String u_id) {				// 이미 등록된 회원 체크 (회원 가입 중복체크)
		ArrayList<RegisterDAO> list =new ArrayList<RegisterDAO>();
		String sql = "select * from user_t where u_id = ? ";
		
		try{
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, u_id);
				rs = pstmt.executeQuery();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<RegisterDAO> register(String u_id, String u_pw, String u_name, String userAge, String u_gender, String u_mail, String u_phone, String u_reg) {
		ArrayList<RegisterDAO> list =new ArrayList<RegisterDAO>();
		String SQL = "INSERT INTO user_t VALUES(?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(SQL);	
			pstmt.setString(1, u_id);
			pstmt.setString(2, u_pw);
			pstmt.setString(3, u_name);
			pstmt.setInt(4, Integer.parseInt(userAge));
			pstmt.setString(5, u_gender);
			pstmt.setString(6, u_mail);
			pstmt.setString(7, u_phone);
			pstmt.setString(7, u_reg);	
			rs = pstmt.executeQuery();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt !=null) pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return list;
	}
	
}
