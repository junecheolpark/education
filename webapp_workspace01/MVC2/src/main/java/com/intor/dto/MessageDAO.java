package com.intor.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.intor.dao.MessageDTO;

public class MessageDAO {
	private BasicDataSource bds;
	
	public MessageDAO() {
		//서버가 실행될때 이미 생성된 Connection pool 찾는 작업
		try {
			Context iCtx = new InitialContext(); // Connection pool을 검색하기 위한 인스턴스 생성
			Context envCtx =(Context)iCtx.lookup("java:comp/env");//자원이 실제 존재하는 위치까지 찾아가는 작업
			bds = (BasicDataSource)envCtx.lookup("jdbc/bds"); //자원의 name값을 이용해 이미만들어진 bds 인스턴스 가져오기
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() throws Exception{
		return bds.getConnection();
	}
	
//	삽입
	public int insert(MessageDTO dto) throws Exception{
		String sql = "insert into message values(seq_message.nextval, ?, ?)";
		
		try(Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, dto.getNickname());
			pstmt.setString(2, dto.getMessage());
			
			int rs = pstmt.executeUpdate();
			return rs;
		}
		
	}
	
//	전체조회
	public ArrayList<MessageDTO> selectAll() throws Exception{
		String sql = "select*from message";
		
		try (Connection con = bds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			ArrayList<MessageDTO> list = new ArrayList<MessageDTO>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nickname = rs.getString("nickname");
				String message = rs.getString("message");
				list.add(new MessageDTO(id, nickname, message));
			}
			return list;
		}
		
	}
	
}
