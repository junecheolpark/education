package com.kh.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.kh.dto.WepDTO;

public class WepDAO {
	private BasicDataSource bds = new BasicDataSource();
	
	public WepDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "kh";
		String password = "kh";
		
		bds.setUrl(url);
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUsername(username);
		bds.setPassword(password);
		bds.setInitialSize(30);
	}
	
	public Connection getConnection() throws Exception{
		return bds.getConnection();
	}
//	모든데이터조회
	public ArrayList<WepDTO> selectAll() throws Exception{
		String sql = "select * from tbl_web";
		try(Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ArrayList<WepDTO> list = new ArrayList<>();
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
//				rs.getString("nickname");
//				rs.getString("message");
				String id = rs.getString(1);
				String post = rs.getString(2);
				
				list.add(new WepDTO(id, post));
			}
			return list;
			
		}
	}
	
//	 insert
	public int insert(String id, String post) throws Exception{
		String sql = "insert into tbl_web values(?, ?)";
		
		try(Connection con = this.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			// 첫번째 인자값 -> 물음표의 번호
			// 두번째 인자값 -> 그 물음표에 셋팅해줄 값
			pstmt.setString(1, id);
			pstmt.setString(2, post);
			
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}
	
	
	public int delete(String id) throws Exception{
		String sql = "delete from tbl_web where id= ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstm = con.prepareStatement(sql)){
			pstm.setString(1, id);
			int rs = pstm.executeUpdate();
			return rs;
		}
	}
	
	//업데이트
		public int update(WepDTO dto) throws Exception{
			String sql = "update tbl_web set post = ? where id = ?";
			
			try(Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPost());
				
				int rs = pstmt.executeUpdate();
				return rs;
			}
			
		}
	
	
}
