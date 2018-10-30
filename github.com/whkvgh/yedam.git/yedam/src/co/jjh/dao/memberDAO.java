package co.jjh.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import co.khj.bean.UserBean;

public class memberDAO {
	DataSource ds;
	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	UserBean bean = new UserBean();

	public memberDAO() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/yedam");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<UserBean> getmemberall() { // 회원 전체 보기
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		String sql = "select * from user_t";
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				bean.setUid(rs.getString("u_id"));
				bean.setUname(rs.getString("u_name"));
				bean.setUpw(rs.getString("u_pw"));
				bean.setUgender(rs.getString("u_gender"));
				bean.setUphone(rs.getString("u_phone"));
				bean.setUbirth(rs.getString("u_birth"));
				bean.setUmail(rs.getString("u_mail"));
				bean.setUreg(rs.getString("u_reg"));

				list.add(bean);
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

	public ArrayList<UserBean> insertemember() {	//회원정보 입력
		ArrayList<UserBean> list = new ArrayList<UserBean>();
	
		String sql = "insert into user_t 	values()";								
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bean.getUbirth());
			psmt.setString(2, bean.getUgender());
			psmt.setString(3, bean.getUid());
			psmt.setString(4, bean.getUmail());
			psmt.setString(5, bean.getUname());
			psmt.setString(6, bean.getUphone());
			psmt.setString(7, bean.getUpw());
			psmt.setString(8, bean.getUreg());
			
			psmt.executeUpdate();
		} catch(Exception e) {
		 e.printStackTrace();
		}finally {
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
		}return list;
	}
	public ArrayList<UserBean> updatemember() { // 회원정보 수정
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		String sql = "update usr_t set upw=?, uname=?, ugender=?, ubirth=?, umail=?, uphone=? where uid=?";
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bean.getUpw());
			psmt.setString(2, bean.getUname());
			psmt.setString(3, bean.getUgender());
			psmt.setString(4, bean.getUbirth());
			psmt.setString(5, bean.getUmail());
			psmt.setString(6, bean.getUphone());

			psmt.executeUpdate();

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

	public ArrayList<UserBean> deletemember() { // 회원정보 삭제
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		String sql = "delete from user_t where id =?";
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bean.getUid());
			psmt.executeUpdate();

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