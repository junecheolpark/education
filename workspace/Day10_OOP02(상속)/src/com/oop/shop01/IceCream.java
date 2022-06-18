package com.oop.shop01;

// extends 상속받고 싶은 클래스명
public class IceCream extends Product{
//품범, 이름, 가격
	public IceCream() {
		super();
		// super > 상속해주는 부모 클래스 참조하는 변수
		// 부모클래스의 기본생성자 호출하는 작업(현재는 Product)
		// 부모 클래스의 인스턴스 또한 생성됨
		// this > 자기 자신
	}
	public IceCream(String product_no, String name, int price) {
		// private 접근 제한자 떄문에 멤버필드에 접근이 불가
		
		//getter/setter를 통해 값세팅
//		this.setName(name);
//		this.setProduct_no(product_no);
//		this.setPrice(price);
// 부모의 매개변수 있는 생성자 활용
		super(product_no, name, price);
		//항상 첫번째에 와야함
	
	
	}
	/* 메서드의 오버라이딩
	 * - 부모 클래스가 가지고 있는 메서드를 재정의하는 작업
	 * 똑같은 이름의 메서드, 똑같은 반환타입, 똑같은 매개변수
	 * 부모 클래스가 가지고 있는 같은 이름의 메서드를 무효화 시킴
	 */ 
	
	//오버로딩
	/*  하나의 클래스 안에서 이뤄짐
	 *  똑같은 이름의 메서드를 매개변수 자료형이나 개수를 달리해주는 작업
	 *  리턴 타입 x
	 */ 
	public double getPromotionPrice() {
		return this.getPrice() * 0.01;
	}
}
