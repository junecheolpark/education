package DTO;

public class Basic extends Membership {
	public Basic(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}

	public String getMembership() {
		return "Basic";
	}
	
}
