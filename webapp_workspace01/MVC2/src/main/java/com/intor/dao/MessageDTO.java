package com.intor.dao;

public class MessageDTO {
	private int id;
	private String nickname;
	private String message;
	
	
	public MessageDTO() {}
	
	public MessageDTO(int id, String nickname, String message) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.message = message;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return id + " : " + nickname + " : " + message;
	}
	
	
	
	
}
