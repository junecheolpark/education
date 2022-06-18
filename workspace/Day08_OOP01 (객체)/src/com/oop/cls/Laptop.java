package com.oop.cls;

public class Laptop {
	/* 추상화 : 노트북이 가지고 잇는 특성, 기능을 주려내는 작업
	 * 
	 * 특성 : 브랜드, 색상, 가격, 사이즈
	 * 기능: 전원 on/off
	 */

	
	// 멤버변수(멤버필드)를 특성을 기준으로 해서 작성
	String brand ;
	String color;
	int price;
	double size;
	
	// 기능 > 메서드(멤버 메서드)
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		System.out.println("전원을 종료합니다.");
	}
	
	
}
