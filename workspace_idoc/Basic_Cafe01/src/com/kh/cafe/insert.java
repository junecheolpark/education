package com.kh.cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert {
	public static void main(String[] args) {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "kh";
			String password = "kh";

			// Connection 객체 생성 -> url, username, password
//			Statement 객체 생성 -> 오라클에서 sql 문을 전송해 쿼리의 결과를 요청할 수 있게 해주는 객체
//			cafe 테이블 새로운 insert ( seq_cafe.nextval, '아이스 아메리카노', 3000, sysdate
			try( Connection con = DriverManager.getConnection(url, username, password);
					Statement stmt = con.createStatement();){
				System.out.println("DB접속 성공");
				String sql = "insert into tbl_student values(1,'tom','010-5555-4444',1990/05/05)";
				int rs =stmt.executeUpdate(sql);
				if (rs >0) {
					System.out.println("데이터 추가성공");
				}else {
					System.out.println("데이터 추가 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

	}
}
