package DTO;

public class Premium extends Membership{
	public Premium(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}

	public String getMembership(){
		return "Premium";
	}
	
	
}
