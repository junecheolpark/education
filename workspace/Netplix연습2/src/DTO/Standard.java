package DTO;

public class Standard extends Member {
	public Standard() {
	}

	public Standard(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}
	public String getMember() {
		return "Stand";
	}
}
