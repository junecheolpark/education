package com.oop.access01;

public class Run {
	public static void main(String[] args) {

		/* 접근제한자
		 * -public : 외부, 모든곳에서 접근이 가능
		 * -private " 반드시 해당 클래스 내부에서만 접근이 가능
		 * -protected : 같은 패키지 혹은 자식 클래스에서만 접근 가능
		 * -default : 같은 패키지 안에서는 모두 접근이 가능
		 * 
		 */
		Access01 ac = new Access01();
		ac.written_date = "2022-03-10";
		System.out.println(ac.written_date);
		ac.age = 50;
		System.out.println(ac.age);
		ac.id = "abc123";
		System.out.println(ac.id);
//		ac.nickname = "ABC";
		
	}
}
