package com.kh.fb;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

public class FacebookDAO {
   BasicDataSource bds = new BasicDataSource();
   private static FacebookDAO instance = null;

   public FacebookDAO() {
      bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
      bds.setUsername("kh");
      bds.setPassword("kh");

      bds.setInitialSize(10);
   }

   public static FacebookDAO getInstance() {
      if (instance == null) {
         instance = new FacebookDAO();
      }
      return instance;
   }

   public Connection getConnection() throws Exception {
      return bds.getConnection();
   }

   // 로그인
   public boolean Login(String Id, String Pw) throws Exception {
      String sql = "select * from Facebook_MB where Id = ? and Pw = ?";

      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

         pstmt.setString(1, Id);
         pstmt.setString(2, Pw);
         ResultSet rs = pstmt.executeQuery();

         if (rs.next()) {
            return true;
         }
         return false;
      }
   }

   // 닉네임 불러오기
   public String getNickname(String Id) throws Exception {
      String sql = "select nickname from Facebook_MB where Id = ?";

      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

         pstmt.setString(1, Id);
         ResultSet rs = pstmt.executeQuery();

         if (rs.next()) {
            return rs.getString(1);
         }
         return null;
      }
   }

   // 회원가입
   public int Id_join(FacebookDTO dto) throws Exception {
      String sql = "insert into Facebook_MB values(?,?,?)";
      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setString(1, dto.getId());
         pstmt.setString(2, dto.getPw());
         pstmt.setString(3, dto.getNickname());

         int rs = pstmt.executeUpdate();
         return rs;
      }
   }

   // 닉네임 중복체크
   public boolean check_nickname(String nickname) throws Exception {
      String sql = "select * from Facebook_MB where nickname = ?";
      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setString(1, nickname);
         ResultSet rs = pstmt.executeQuery();

         if (rs.next()) { // 중복된 닉네임이 있음
            return false; // 사용불가 닉네임 false 리턴
         }
         return true; // 사용할 수 있는 닉네임일 경우 true 리턴
      }
   }

   // 아이디중복체크
   public boolean check_id(String id) throws Exception {
      String sql = "select * from Facebook_MB where id = ?";
      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setString(1, id);
         ResultSet rs = pstmt.executeQuery();

         if (rs.next()) { // 중복된 아이디가 있음
            return false; // 사용불가 아이디 false 리턴
         }
         return true; // 사용할 수 있는 아이디일 경우 true 리턴
      }
   }

   // insert
   public int insert(PostDTO dto) throws Exception {

      String sql = "insert into Post values(seq_pno.nextval,?,?,sysdate,?)";
      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setString(1, dto.getTitle());
         pstmt.setString(2, dto.getNickname());
         pstmt.setString(3, dto.getMemo());

         int rs = pstmt.executeUpdate();
         return rs;
      }
   }

   // 포스트 목록 다 출력
   public ArrayList<PostDTO> selectAll() throws Exception {

      String sql = "select * from Post";

      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         ResultSet rs = pstmt.executeQuery();
         ArrayList<PostDTO> list = new ArrayList<>();

         while (rs.next()) {
            int no = rs.getInt(1);
            String title = rs.getString(2);
            String nickname = rs.getString(3);
            String register_date = parseDate(rs.getDate(4));
            String memo = rs.getString(5);

            list.add(new PostDTO(no, title, nickname, register_date, memo));
         }
         return list;
      }
   }

   // 번호받아서 하나 출력
   public PostDTO select(int pno) throws Exception {
      String sql = "select * from Post where no = ?";
      try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

         pstmt.setInt(1, pno);

         ResultSet rs = pstmt.executeQuery();
         if (rs.next()) {
            int no = rs.getInt(1);
            String nickname = rs.getString(3);
            String register_date = parseDate(rs.getDate(4));
            String title = rs.getString(2);
            String memo = rs.getString(5);

            PostDTO dto = new PostDTO(no, nickname, title, register_date, memo);
            return dto;
         }
         return null;
      }
   }

   // 업데이트
   public int update(PostDTO dto) throws Exception {

      String sql = "update Post set title = ?, memo = ? where no = ?";

      try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setString(1, dto.getTitle());
         pstmt.setString(2, dto.getMemo());
         pstmt.setInt(3, dto.getNo());

         int rs = pstmt.executeUpdate();
         return rs;

      }
   }

   public int insert_C(int no, String com, String nickname) throws Exception { // 덧글 추가
      String sql = "insert into post_com values(?,?,?,sysdate)";
      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setInt(1, no);
         pstmt.setString(2, com);
         pstmt.setString(3, nickname);
         int rs = pstmt.executeUpdate();
         return rs;

      }
   }

   public ArrayList<CommentDTO> selectAll_c(int num) throws Exception { // 댓글 목록
      String sql = "select * from post_com where no = ?";
      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setInt(1, num);

         ResultSet rs = pstmt.executeQuery();
         ArrayList<CommentDTO> list = new ArrayList<>();
         while (rs.next()) {
            String Com = rs.getString(2);
            String Nickname = rs.getString(3);
            String Reporing_date = parseDate(rs.getDate(4));
            int no = rs.getInt(1);
            list.add(new CommentDTO(no, Com, Nickname, Reporing_date));
         }
         return list;
      }
   }

   public int delete(int no) throws Exception { // 포스트 삭제
      String sql = "delete from post where no= ? ";

      try (Connection con = this.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);) {

         pstmt.setInt(1, no);
         // pstmt.setString(2, nickname);

         int rs = pstmt.executeUpdate();
         return rs;
      }

   }

   public String parseDate(Date date) {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm");
      return sdf.format(date);
   }

}