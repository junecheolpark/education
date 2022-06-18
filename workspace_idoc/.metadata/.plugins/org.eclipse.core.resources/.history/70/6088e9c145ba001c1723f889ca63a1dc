package com.kh.cafe.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//sql 값을 ? 지정 후 pstmt.set자료형(순서, dto.get 으로 불러옴)
public class SQLInjection설명 {
	public static void main(String[] args) {
//	select("abc123", "5555' or '1' = '1");
//		select2("abc123', '5555' or '1' = '1'");
	}
//	prearedStatement -> 객체를 생성할때 인자값으로 넘겨주는 sql문(쿼리문)을 미리 DBMS에 컵파일하여 올려둠
//	? -? 추후에 인자값을 세팃해줄 자리 표시
//	 추후에 ? 자리에 set 되는 값을 말그대로 값 그자체로 들어가게 됨(문자열 인식)
//	5555 or 1 = 1 -> 이러한 식을 넣어도 값으로만 인식이 되기 때문에 SQL Inject에 대한 방지처리가 됨.
//	 Strement 객체보다 PreparedStatement 객체를 활용했을때 기독성도 높아짐.
	public static void select2(String id, String pw) {
		String url = "jdbc:orcle:thin:@localhost:1521:xe";
		String username = "kh";
		String password = "kh";
		
		String sql = "select * from tbl_member where id = ? and pw = ?";
		
		try(Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareCall(sql);){
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString(1) + " : " + rs.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
