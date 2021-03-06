package com.kh.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
private String username = "kh";
private String password = "kh";

public int insert(DTO dto) throws Exception{//입력
	try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();){
		String sql = "insert into tbl_student values(seq_std.nextval, '" + dto.getName() +"', '"+ dto.getPhone() +"',to_date('"+dto.getBirth()+"', 'yyyy,mm,dd'))";
		int rs = stmt.executeUpdate(sql);
		return rs;
	}
}
	
public int update(DTO dto) throws Exception{//수정
	try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();){
		String sql = "update tbl_student set name = '"+dto.getName()+"', phon ='"+dto.getPhone()+"',birth_date = to_date('"+dto.getBirth()+"', 'yyyy,mm,dd') where no = " +dto.getNo();
		int rs = stmt.executeUpdate(sql);
		return rs;
	}
}
public int delete(int no) throws Exception{//삭제
	try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();){
		String sql = "delete from tbl_student where no = " +no;
		int rs = stmt.executeUpdate(sql);
		return rs;
	}
}
public DTO select(int no1) throws Exception{//하나만 조회
	try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();){
		
		String sql = " select * from tbl_student where no = "+ no1 ;
		ResultSet rs =stmt.executeQuery(sql);
		if(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			String phone = rs.getString(3);
			String birth = rs.getString(4);
			DTO dto = new DTO(no, name, phone, birth);
			return dto;
		}
		return null;
	}
}

public ArrayList<DTO> selectAll() throws Exception{
	try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();){
		String sql = "select * from tbl_student";
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList<DTO> list = new ArrayList();
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			String phone = rs.getString(3);
			String birth = rs.getString(4);
			list.add(new DTO(no, name, phone, birth));
		}
		return list;
	}
}

}
