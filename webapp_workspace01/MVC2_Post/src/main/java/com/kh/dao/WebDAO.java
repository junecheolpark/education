package com.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.kh.dto.WebDTO;

public class WebDAO {
	private BasicDataSource bds;

	public WebDAO() {
		// 서버가 실행될때 이미 생성된 Connection pool 찾는 작업
		try {
			Context iCtx = new InitialContext(); // Connection pool을 검색하기 위한 인스턴스 생성
			Context envCtx = (Context) iCtx.lookup("java:comp/env");// 자원이 실제 존재하는 위치까지 찾아가는 작업
			bds = (BasicDataSource) envCtx.lookup("jdbc/bds"); // 자원의 name값을 이용해 이미만들어진 bds 인스턴스 가져오기

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws Exception {
		return bds.getConnection();
	}

//	모든데이터조회
	public ArrayList<WebDTO> selectAll() throws Exception {
		String sql = "select * from tbl_web";
		try (Connection con = this.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			ArrayList<WebDTO> list = new ArrayList<>();
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String post = rs.getString("post");

				list.add(new WebDTO(no, id, post));
			}
			return list;

		}
	}

	//하나만 조회
	public WebDTO selectByNo(int no) throws Exception{
		String sql = "select * from tbl_web where no = ?";
		try(Connection con = bds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
			
				String id = rs.getString("id");
				String post = rs.getString("post");
				return new WebDTO(no, id, post);
			}
			
		}
		return null;
		
	}
	
	//데이터수정
	public int modifyByNo(WebDTO dto) throws Exception {
		String sql = "update tbl_web set id=?, post=? where no = ?";
		try(Connection con = bds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPost());
			pstmt.setInt(3, dto.getNo());
			
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}

//	 insert
	public int insert(WebDTO dto) throws Exception {
		String sql = "insert into tbl_web values(seq_web.nextval,?, ?)";

		try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			// 첫번째 인자값 -> 물음표의 번호
			// 두번째 인자값 -> 그 물음표에 셋팅해줄 값
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPost());

			int rs = pstmt.executeUpdate();
			return rs;
		}
	}

//	삭제
	public int delete(int no) throws Exception {
		String sql = "delete from tbl_web where no= ?";
		try (Connection con = this.getConnection(); PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.setInt(1, no);
			int rs = pstm.executeUpdate();
			return rs;
		}
	}

	


}
