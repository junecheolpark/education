package com.kh.fb;

public class CommentDTO {
	private String Com;
	private String nickname;
	private String Reporing_date;
	private int No;

	public CommentDTO() {
	}

	public CommentDTO(int no, String com, String nickname, String reporing_date) {
		super();
		Com = com;
		this.nickname = nickname;
		Reporing_date = reporing_date;
		No = no;
	}

	public String getCom() {
		return Com;
	}

	public void setCom(String com) {
		Com = com;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getReporing_date() {
		return Reporing_date;
	}

	public void setReporing_date(String reporing_date) {
		Reporing_date = reporing_date;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	@Override
	public String toString() {
		return No + " : " + Com + " : " + nickname + " : " + Reporing_date;
	}

	
}