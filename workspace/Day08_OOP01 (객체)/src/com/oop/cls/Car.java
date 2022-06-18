package com.oop.cls;
/*
 * 속성: brand, speed, oil 
 * 기능: 시동 on/off, speed up/down
 * 정보은닉(캡슐화):
 * 사용자가 접근하면 안되는 데이터들을 내부적으로 숨기거나 접근을 제안하는것
 * >1. 접근제한자 사용
 * > 2. getter/ setter
 *  private 접근 제한자 사용 > 외부에서 접근이 불가
 *  > getter : read-only(읽기전용)
 *  > setter : writ-only(쓰기전용)
 */

public class Car {

	private String brand;
	private int speed;
	private int oil;

	/* 생성자(Constructor)
	 * -리턴타입 없음
	 * -클래스명과 이름이 같음
	 *  인스턴스가 만들어질 떄 초기화 해주는 역할 
	 *  기본 생성자(default constructor)는 명시하지 않아도 JVM이 알아서 
	 *  생성해줌 
	 *  >다만 매개변수가 있는 생성자를 정의하는 순간부터는 jvm이 기본생성자를 만들어주지 않음
	 *  > 생성자 또한 메서드 이기 떄문에 오버로딩이 가능
	 */
	public Car() {}
	public Car(String brand, int speed, int oil) {
		this.brand = brand;
		this.speed = speed;
		this.oil = oil;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//
	public int getOil() {
		return this.oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	//
	
	
	public void speedUp() {
		speed++;
	}

	public void speedDown(){
		speed--;
	}
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
	}

	public void powerOff() {
		System.out.println("시동이 꺼졌습니다..");
	}
}
