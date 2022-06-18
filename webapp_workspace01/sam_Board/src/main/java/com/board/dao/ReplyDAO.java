package com.board.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.board.dto.ReplyDTO;

public class ReplyDAO {
	private BasicDataSource bds;
	
	public ReplyDAO() {
		try {
			Context iCtx = new InitialContext();
			Context envCtx = (Context)iCtx.lookup("java:comp/env");
			bds = (BasicDataSource)envCtx.lookup("jdbc/bds");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int modify(ReplyDTO dto) throws Exception{
		String sql = "update tbl_reply set content=? where seq_reply = ?";
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setString(1, dto.getContent());
			pstmt.setInt(2, dto.getSeq_reply());
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}
	
	public int delete(int seq_reply) throws Exception{
		String sql = "delete from tbl_reply where seq_reply = ?";
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, seq_reply);
			int rs = pstmt.executeUpdate();
			return rs;
		}
	}
	
	public int insert(ReplyDTO dto) throws Exception{
		String sql = "insert into tbl_reply values(seq_reply.nextval,?,?,?,?,sysdate)";
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, dto.getSeq_board());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getWriter_nickname());
			pstmt.setString(4, dto.getWriter_id());
			
			int rs = pstmt.executeUpdate();
			return rs;			
		}
	}
	
	public ArrayList<ReplyDTO> selectAll(int seq_board) throws Exception{
		String sql = "select * from tbl_reply where seq_board = ?";
		try(Connection con = bds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, seq_board);
			ResultSet rs = pstmt.executeQuery();
			
			ArrayList<ReplyDTO> list = new ArrayList<>();
			while(rs.next()) {
				int seq_reply = rs.getInt("seq_reply");
				String content = rs.getString("content");
				String writer_nickname = rs.getString("writer_nickname");
				String writer_id = rs.getString("writer_id");
				String written_date = getStringDate(rs.getDate("written_date"));
				list.add(new ReplyDTO(seq_reply, seq_board, content, writer_nickname, writer_id, written_date));
			}
			return list;			
		}
	}
	
	public String getStringDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(date);
	}
}