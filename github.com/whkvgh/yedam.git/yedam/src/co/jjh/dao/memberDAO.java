package co.jjh.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import co.jjh.bean.memberDTO;


public class memberDAO {
	DataSource ds;
	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	memberDTO dto = new memberDTO();
	
	public memberDAO() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/yedam");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<memberDTO> deletemember() {	//회원정보 삭제
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		String sql = "delete from user_t where id =?";
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getuId());
			psmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					rs.close();
				if (conn != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public ArrayList<memberDTO> getmemberall() { // 회원 전체 보기
		ArrayList<memberDTO> list = new ArrayList<memberDTO>();
		String sql = "select * from user_t";
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				
				dto.setuId(rs.getString("u_id"));
				dto.setuName(rs.getString("u_name"));
				dto.setuPw(rs.getString("u_pw"));
				dto.setuGender(rs.getString("u_gender"));
				dto.setuPhone(rs.getString("u_phone"));
				dto.setuBirth(rs.getString("u_birth"));
				dto.setuMail(rs.getString("u_mail"));
				dto.setuReg(rs.getString("u_reg"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					rs.close();
				if (conn != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}