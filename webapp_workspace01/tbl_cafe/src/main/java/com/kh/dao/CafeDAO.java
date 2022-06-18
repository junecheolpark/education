package com.kh.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.kh.dto.CafeDTO;

public class CafeDAO {

	private BasicDataSource bds;

	public CafeDAO() {
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
	public ArrayList<CafeDTO> selectAll() throws Exception {
		String sql = "select * from tbl_cafe";
		try (Connection con = this.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			ArrayList<CafeDTO> list = new ArrayList<>();
			
			while (rs.next()) {
				int product_id = rs.getInt("product_id");
				String product_name = rs.getString("product_name");
				int product_price = rs.getInt("product_price");

				list.add(new CafeDTO(product_id, product_name, product_price));
			}
			return list;

		}
	}
	
	//하나만 조회
	public CafeDTO selectById(String product_name) throws Exception{
		String sql = "select * from tbl_cafe where product_id = ?";
		try(Connection con = bds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, product_name);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
			
				int product_id = rs.getInt("product_id");
				String product_name_std = rs.getString("product_name");
				int product_price = rs.getInt("product_price");
				return new CafeDTO(product_id, product_name_std, product_price);
			}
			
		}
		return null;
		
	}
	
//	 insert
	public int insert(CafeDTO dto) throws Exception {
		String sql = "insert into tbl_web values(seq_web.nextval,?, ?)";

		try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			// 첫번째 인자값 -> 물음표의 번호
			// 두번째 인자값 -> 그 물음표에 셋팅해줄 값
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getProduct_price());

			int rs = pstmt.executeUpdate();
			return rs;
		}
	}
	
	
	
	
}
