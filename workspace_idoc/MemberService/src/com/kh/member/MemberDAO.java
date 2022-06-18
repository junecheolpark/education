package com.kh.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbcp2.BasicDataSource;

public class MemberDAO {
	private BasicDataSource bds = new BasicDataSource();
	private static MemberDAO instance = null;

	private MemberDAO() {
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kh");
		bds.setPassword("kh");
		bds.setInitialSize(10);
	}

	public static MemberDAO getInstance() {
		if (instance == null) {
			instance = new MemberDAO();
		}
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		return bds.getConnection();
	}


	public int insert(MemberDTO dto) throws Exception {// 회원가입
		String sql = "insert into member_tbl values(?, ?, ?)";
		try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getNickname());
			int rs = pstmt.executeUpdate();
			return rs;
		}

	}

	public String login(String id, String pw) throws Exception {// 로그인
		String sql = "select * from member_tbl where id = ? and pw = ?";
		try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String nickname = rs.getString(1);
				return nickname;

			}
			return null;
		}

	}

	public String Check(String id) throws Exception {// id 중복확인
		String sql = "select * from member_tbl where id = ? ";
		try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String nickname = rs.getString(1);
				return nickname;

			}
			return null;

		}
	}

	public int delete(String id, String pw) throws Exception {
		String sql = "delete from member_tbl where id = ? and pw = ?";
		try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			int rs = pstmt.executeUpdate();
			return rs;

		}
	}

}
