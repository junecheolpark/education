package com.board.dto;

public class MemberDTO {
	private String id;
	private String pw;
	private String nickname;
	private String phone;
	private String postCode;
	private String roadAddr;
	private String detailAddr;
	private String extraAddr;
	
	public MemberDTO() {}
	public MemberDTO(String id, String pw, String nickname, String phone, String postCode, String roadAddr,
			String detailAddr, String extraAddr) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.phone = phone;
		this.postCode = postCode;
		this.roadAddr = roadAddr;
		this.detailAddr = detailAddr;
		this.extraAddr = extraAddr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getRoadAddr() {
		return roadAddr;
	}
	public void setRoadAddr(String roadAddr) {
		this.roadAddr = roadAddr;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getExtraAddr() {
		return extraAddr;
	}
	public void setExtraAddr(String extraAddr) {
		this.extraAddr = extraAddr;
	}
	@Override
	public String toString() {
		return id + " : " + pw + " : "+ nickname + " : " + phone + " : "
				+ postCode +  " : "+ roadAddr +  " : "+ detailAddr + " : "+ extraAddr;
	}
}
