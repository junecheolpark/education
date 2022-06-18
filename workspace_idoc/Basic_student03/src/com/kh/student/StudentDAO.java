package com.kh.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
private String username = "kh";
private String password = "kh";

public int insert(DTO dto)throws Exception {
	String sql = "insert into tbl_student values(seq_std.nextval, "
			+ "?, ?,to_date(?, 'yyyy,mm,dd'))";
	try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setString(1,dto.getName());
		pstmt.setString(2,dto.getPhone());
		pstmt.setString(3, dto.getBirth());
		int rs = pstmt.executeUpdate();
		return rs;
	}
}

public int update(DTO dto)throws Exception {
	String sql = "update tbl_student set name = ?, phon "
			+ "= ?,birth_date = to_date(?, 'yyyy,mm,dd') where no = ?";
	try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setString(1,dto.getName());
		pstmt.setString(2,dto.getPhone());
		pstmt.setString(3,dto.getBirth());
		pstmt.setInt(4,dto.getNo());
		int rs = pstmt.executeUpdate();
		return rs;
	}
	
}
public int delete(int no) throws Exception{//삭제
	String sql = "delete from tbl_student where no = ?" ;
	try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setInt(1, no);
		int rs = pstmt.executeUpdate();
		return rs;
	}
}
public DTO select(int no1) throws Exception{//하나만 조회
	String sql = " select * from tbl_student where no = ?" ;
	try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setInt(1, no1);
		ResultSet rs =pstmt.executeQuery();
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
	String sql = "select * from tbl_student";
	try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement(sql);){
		ResultSet rs = pstmt.executeQuery();
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
