package com.kh.cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class 설명 {
	//Statement(보안성이 취약함) 사용하면서 sql 값을 dto.get 으로 불러옴
	
	//예)
	/*
	public class CafeDAO {
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String username = "kh";
		private String password = "kh";

			public int insert(CafeDTO dto) throws Exception {//1
				
				try (Connection con = DriverManager.getConnection(url, username, password);
						Statement stmt = con.createStatement();) {
					String sql = "insert into cafe values(seq_cafe.nextval, '" + dto.getProduct_name() 
					+ "'," + dto.getPrice() + ", sysdate)";
					int rs = stmt.executeUpdate(sql);
					return rs;
				}
			}
}*/
}
