package com.oop.test;

class A {
	public void funcA() {
		System.out.println("funA");
	}

	public void funcExtra() {
		System.out.println("A");
	}
}

class B extends A {
	public void funcB() {
		System.out.println("funB");
	}

	public void funcExtra() {
		System.out.println("B");
	}
}

class C extends A {
	public void funcC() {
		System.out.println("funC");
	}
}

public class Test {
//다형성
	public static void main(String[] args) {
		/*
		 * 다형성 : 다양한 형태의 성질을 갖는것(한 클래스 다양한 클래스의 성질을 가질수 있는것)
		 *  (상속관계에서 부모타입의 참조변수가 자식타입의 인스턴스를 담을수 있는것)
		 */
		A a1 = new B();
		a1.funcA();
		a1.funcExtra();
		
		A a2 = new C(); //자신을 상속받는 모든 자식형 인스턴스를 부모형 참조변수에 담을수 있음
		a2.funcA();
		int a = 10;
		long b = a; // 자동형변환 > 큰 자료형에 작은 자료형을 담는 upcasting
		
		//부모형 참조변수로 자식의 기능을 사용허ㅏ게 하고싶다면?
		// 강제형변환 > a라는 참조변수 (상위 클래스)를 b형으로 (자식클래스)다운캐스팅
		((B)a1).funcB();
		((C)a2).funcC();
		
		// 반대로 자식 클래스형 참조변수에 부모 인스턴스를 담을수 없다.
	}
}
