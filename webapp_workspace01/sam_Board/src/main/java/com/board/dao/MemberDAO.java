package com.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.board.dto.MemberDTO;

public class MemberDAO {
	private BasicDataSource bds;
	
	public MemberDAO() {
		try {
			Context iCtx = new InitialContext();
			Context envCtx = (Context)iCtx.lookup("java:comp/env");
			bds = (BasicDataSource)envCtx.lookup("jdbc/bds");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int modify(MemberDTO dto) throws Exception{
		String sql = "update tbl_member set nickname=?, phone=?, postCode=?,"
				+ "roadAddr=?, detailAddr=?, extraAddr=? where id=?";
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, dto.getNickname());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getPostCode());
			pstmt.setString(4, dto.getRoadAddr());
			pstmt.setString(5, dto.getDetailAddr());
			pstmt.setString(6, dto.getExtraAddr());
			pstmt.setString(7, dto.getId());
			
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}
	
	public int signup(MemberDTO dto) throws Exception{
		String sql = "insert into tbl_member values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getNickname());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getPostCode());
			pstmt.setString(6, dto.getRoadAddr());
			pstmt.setString(7, dto.getDetailAddr());
			pstmt.setString(8, dto.getExtraAddr());
			
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}
	
	public MemberDTO isLoginOk(String id, String pw) throws Exception{
		String sql = "select * from tbl_member where id = ? and pw = ?";
		
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { // 로그인 성공이라면
				String nickname = rs.getString("nickname");
				String phone = rs.getString("phone");
				String postCode = rs.getString("postCode");
				String roadAddr = rs.getString("roadAddr");
				String detailAddr = rs.getString("detailAddr");
				String extraAddr = rs.getString("extraAddr");
				
				return new MemberDTO(id,null,nickname,phone,postCode,roadAddr,detailAddr,extraAddr);
			}else { // 로그인 실패라면
				return null;
			}
		}
	}
	
	public boolean checkId(String id) throws Exception{
		String sql = "select count(*) from tbl_member where id = ?";
		
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			int result = 0;
			if(rs.next()) {
				result = rs.getInt(1);
			}
			if(result == 0) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	public MemberDTO selectById(String id) {
		String sql = "SELECT * FROM TBL_MEMBER where id=?";
		
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setNickname(rs.getString("nickname"));
				dto.setPhone(rs.getString("phone"));
				dto.setPostCode(rs.getString("postcode"));
				dto.setRoadAddr(rs.getString("roadAddr"));
				dto.setDetailAddr(rs.getString("detailAddr"));
				dto.setExtraAddr(rs.getString("extraAddr"));
				return dto;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
