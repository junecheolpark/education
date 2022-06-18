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
//������
	public static void main(String[] args) {
		/*
		 * ������ : �پ��� ������ ������ ���°�(�� Ŭ���� �پ��� Ŭ������ ������ ������ �ִ°�)
		 *  (��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ν��Ͻ��� ������ �ִ°�)
		 */
		A a1 = new B();
		a1.funcA();
		a1.funcExtra();
		
		A a2 = new C(); //�ڽ��� ��ӹ޴� ��� �ڽ��� �ν��Ͻ��� �θ��� ���������� ������ ����
		a2.funcA();
		int a = 10;
		long b = a; // �ڵ�����ȯ > ū �ڷ����� ���� �ڷ����� ��� upcasting
		
		//�θ��� ���������� �ڽ��� ����� ����㤿�� �ϰ�ʹٸ�?
		// ��������ȯ > a��� �������� (���� Ŭ����)�� b������ (�ڽ�Ŭ����)�ٿ�ĳ����
		((B)a1).funcB();
		((C)a2).funcC();
		
		// �ݴ�� �ڽ� Ŭ������ ���������� �θ� �ν��Ͻ��� ������ ����.
	}
}
