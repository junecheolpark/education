package com.kh.dto;

public class WepDTO {
	private String id;
	private String post;
	
	public WepDTO() {}

	public WepDTO(String id, String post) {
		super();
		this.id = id;
		this.post = post;
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
		return id + " : " + post;
	}
	
	
	
}
