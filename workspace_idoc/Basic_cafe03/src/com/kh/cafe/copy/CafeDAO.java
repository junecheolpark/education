package com.kh.cafe.copy;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CafeDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "kh";
	private String password = "kh";
//PreparedStatement(보안성이 더좋음) 값을 사용하면서 

	public int insert(CafeDTO dto) throws Exception {// 1 예외전가
		String sql = "insert into cafe values(seq_cafe.nextval, ?, ?, sysdate)";
		try (Connection con = DriverManager.getConnection(url, username, password);
				// PreparedStatement 객체는 쿼리문을 인자값으로 하여 생성
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			// ?에 해당하는 인자값 세팅
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getPrice());
//			쿼리문을 실행
			int rs = pstmt.executeUpdate();
			return rs;

		}
	}

	public int update(CafeDTO dto) throws Exception {// 2
		String sql = "update cafe set product_name = ?, price = ? where product_id =?";
		try (Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getPrice());
			pstmt.setInt(3, dto.getProduct_id());
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}

	public int delete(int id) throws Exception {// 3
		String sql = " delete from cafe where product_id = ?";
		try (Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1,  id);;
			int rs = pstmt.executeUpdate();
			return rs;

		}
	}

	// 1개 데이터에 대한 셀렉트
	public CafeDTO select(int id) throws Exception {// 4
		String sql = " select * from cafe where product_id = ? " ;
		try (Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int product_id = rs.getInt(1);
				String product_name = rs.getString(2);
				int price = rs.getInt(3);
				Date register_date = rs.getDate(4);
				CafeDTO dto = new CafeDTO(product_id, product_name, price, register_date);
				return dto;
			}
			return null;
		}
	}

	public ArrayList<CafeDTO> selectAll() throws Exception {
		String sql = "select * from cafe";
		try (Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement stmt = con.prepareStatement(sql);) {
			
			ResultSet rs = stmt.executeQuery();
			ArrayList<CafeDTO> list = new ArrayList<>();
			while (rs.next()) {
				int product_id = rs.getInt(1);
				String product_name = rs.getString(2);
				int price = rs.getInt(3);
				Date register_date = rs.getDate(4);
				list.add(new CafeDTO(product_id, product_name, price, register_date));
			}
			return list;
		}

	}

}
