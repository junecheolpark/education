package DTO;

public class Stand extends Membership {
	public Stand(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}
	public String getMembership() {
		return "stand";
	}

	
}
