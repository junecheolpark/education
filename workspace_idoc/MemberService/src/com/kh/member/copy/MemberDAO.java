package com.kh.member.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbcp2.BasicDataSource;



public class MemberDAO {
	private BasicDataSource bds = new BasicDataSource();

	public MemberDAO() {
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kh");
		bds.setPassword("kh");
		bds.setInitialSize(10);
	}

	public Connection getConnection() throws Exception {
		return bds.getConnection();
	}
	
	// 로그인 가능여부 확인
	public boolean isLoginOk(String id, String pw) throws Exception{
		String sql = "select * from member_tbl where id = ? and pw = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) { // id pw 정상입력 -> 로그인 가능
				return true; 
			}
			return false; // 로그인 불가
		}
	}
	
	// 닉네임 가져오기
	public String getNickname(String id) throws Exception {
		String sql = "select nickname from member_tbl where id = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return rs.getString(1);
			}
			return null;
		}		
	}	

	// 아이디 중복검사
	public boolean checkId(String id) throws Exception{
		String sql = "select * from member_tbl where id = ?";
		try(Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) { // 중복된 아이디가 있음
				return false; // 사용불가 아이디 false 리턴
			}
			return true; //	사용할 수 있는 아이디일 경우 true 리턴
		}		
	}
	
	// 회원가입
	public int insert(MemberDTO dto) throws Exception{
		String sql = "insert into member_tbl values(?,?,?)";
		try(Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getNickname());
			
			int rs = pstmt.executeUpdate();
			return rs;
		}		
	}	
	
	// 회원탈퇴
	public int delete(String id) throws Exception{
		String sql = "delete from member_tbl where id = ?";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, id);
			int rs = pstmt.executeUpdate();
			return rs;
		}		
	}
	
	
	
	
	
	
	
	
	
	
}
