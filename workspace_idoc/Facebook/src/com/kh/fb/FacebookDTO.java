package com.kh.fb;

public class FacebookDTO {
   private String Id;
   private String Pw;
   private String Nickname;

   public FacebookDTO() {}
   public FacebookDTO(String id, String pw, String nickname) {
      super();
      Id = id;
      Pw = pw;
      Nickname = nickname;
   }
   public String getId() {
      return Id;
   }
   public void setId(String id) {
      Id = id;
   }
   public String getPw() {
      return Pw;
   }
   public void setPw(String pw) {
      Pw = pw;
   }
   public String getNickname() {
      return Nickname;
   }
   public void setNickname(String nickname) {
      Nickname = nickname;
   }

   
   

}