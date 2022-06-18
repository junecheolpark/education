package com.kh.cafe;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CafeDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "kh";
	private String password = "kh";
	
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

	
//	public String toJavaString(Date date) {
//		// 년/월/일 24시:분:초
//		// 자바에서 hh -> default 12시간 기준으로 표기됨
//		// HH -> 24시간으로 표기
//		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
//		String date_str = sdf.format(date);
//		return date_str;
//	}

}
