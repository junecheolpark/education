package com.kh.fb;

public class PostDTO {
   private int No;
   private String Nickname;
   private String Title;
   private String Register_date;
   private String Memo;
   
   public PostDTO() {}
   public PostDTO(int no, String nickname, String title, String register_date, String memo) {
      super();
      No = no;
      Nickname = nickname;
      Title = title;
      Register_date = register_date;
      Memo = memo;
   }
   public int getNo() {
      return No;
   }
   public void setNo(int no) {
      No = no;
   }
   public String getNickname() {
      return Nickname;
   }
   public void setNickname(String nickname) {
      Nickname = nickname;
   }
   public String getTitle() {
      return Title;
   }
   public void setTitle(String title) {
      Title = title;
   }
   public String getRegister_date() {
      return Register_date;
   }
   public void setRegister_date(String register_date) {
      Register_date = register_date;
   }
   public String getMemo() {
      return Memo;
   }
   public void setMemo(String memo) {
      Memo = memo;
   }
   @Override
   public String toString() {
      return  No + "\t" + Title + "\t" + Nickname + "\t" + Register_date;
   }

}