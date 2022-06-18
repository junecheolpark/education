package com.kh.cafe.copy;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

public class CafeDAO {
// BasicDataSource 클래스 인스턴스 생성 0> DBCP를 만들어주는 클래스
	private BasicDataSource bds = new BasicDataSource();
//	DBCP 를 구성하기 위해 필요한 설정값 셋팅
	public CafeDAO() {
		// CafeDAO 생성자가 호출되면 자동으로 bds 에 설정값을 부여하도록
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kh");
		bds.setPassword("kh");
		// 커넷션 개수 셋팅
		bds.setInitialSize(10);
	}
	public Connection getConnection() throws Exception{
		return bds.getConnection();
	}
	public int insert(CafeDTO dto) throws Exception {// 1 예외전가
		String sql = "insert into cafe values(seq_cafe.nextval, ?, ?, sysdate)";
		
		try (Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getPrice());
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}

	public int update(CafeDTO dto) throws Exception {// 2
		String sql = "update cafe set product_name = ?, price = ? where product_id =?";
		try (Connection con = this.getConnection();
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
		try (Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1,  id);
			int rs = pstmt.executeUpdate();
			return rs;

		}
	}

	// 1개 데이터에 대한 셀렉트
	public CafeDTO select(int id) throws Exception {// 4
		String sql = " select * from cafe where product_id = ? " ;
		try (Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int product_id = rs.getInt(1);
				String product_name = rs.getString(2);
				int price = rs.getInt(3);
				String register_date = toJavaString(rs.getDate(4));
				CafeDTO dto = new CafeDTO(product_id, product_name, price, register_date);
				return dto;
			}
			return null;
		}
	}

	public ArrayList<CafeDTO> selectAll() throws Exception {
		String sql = "select * from cafe";
		try (Connection con = this.getConnection();
				PreparedStatement stmt = con.prepareStatement(sql);) {
			
			ResultSet rs = stmt.executeQuery();
			ArrayList<CafeDTO> list = new ArrayList<>();
			while (rs.next()) {
				int product_id = rs.getInt(1);
				String product_name = rs.getString(2);
				int price = rs.getInt(3);
				String register_date = toJavaString(rs.getDate(4));
				list.add(new CafeDTO(product_id, product_name, price, register_date));
			}
			return list;
		}
	}
	public String toJavaString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		String date_str = sdf.format(date);
		return date_str;
	}

}
