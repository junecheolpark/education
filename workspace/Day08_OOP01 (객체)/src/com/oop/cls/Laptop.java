package com.oop.cls;

public class Laptop {
	/* �߻�ȭ : ��Ʈ���� ������ �մ� Ư��, ����� �ַ����� �۾�
	 * 
	 * Ư�� : �귣��, ����, ����, ������
	 * ���: ���� on/off
	 */

	
	// �������(����ʵ�)�� Ư���� �������� �ؼ� �ۼ�
	String brand ;
	String color;
	int price;
	double size;
	
	// ��� > �޼���(��� �޼���)
	public void powerOn() {
		System.out.println("������ �������ϴ�.");
	}
	public void powerOff() {
		System.out.println("������ �����մϴ�.");
	}
	
	
}
