package com.kh.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {

		// 1. 1번학생의 데이터만 가져와서 출력해보기
		// 2. 전체 학생의 데이터 가져와서 출력해보기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "kh";
		String password = "kh";
		try(Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();	){
			System.out.println("DB접속 성공");
			String sql1 = "select * from tbl_student where no = 1";
			String sql2 = "select * from tbl_student";
			
			//하나의 데이터만 가져옴
			/*
			ResultSet rs = stmt.executeQuery(sql1);
			if(rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getDate(4));
			}*/
			// 여러개의 데이터
			ResultSet rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getDate(4));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
