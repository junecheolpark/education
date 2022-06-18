package 생활코딩;

import java.util.HashMap;

public class asd {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("name", "박준철");
		map.put("password", "asd1234");

		System.out.println(map.toString());
		System.out.println(map.get("name"));
		
	
	}
}
