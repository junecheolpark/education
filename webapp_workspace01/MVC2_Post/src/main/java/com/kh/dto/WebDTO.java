package com.kh.dto;

public class WebDTO {
	private int no;
	private String id;
	private String post;
	
	public WebDTO() {}

	public WebDTO(int no, String id, String post) {
		super();
		this.no = no;
		this.id = id;
		this.post = post;
	}

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return no + " : " + id + " : " + post;
	}
	
	
	
}
