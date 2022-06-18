package com.oop.cls;
/*
 * �Ӽ�: brand, speed, oil 
 * ���: �õ� on/off, speed up/down
 * ��������(ĸ��ȭ):
 * ����ڰ� �����ϸ� �ȵǴ� �����͵��� ���������� ����ų� ������ �����ϴ°�
 * >1. ���������� ���
 * > 2. getter/ setter
 *  private ���� ������ ��� > �ܺο��� ������ �Ұ�
 *  > getter : read-only(�б�����)
 *  > setter : writ-only(��������)
 */

public class Car {

	private String brand;
	private int speed;
	private int oil;

	/* ������(Constructor)
	 * -����Ÿ�� ����
	 * -Ŭ������� �̸��� ����
	 *  �ν��Ͻ��� ������� �� �ʱ�ȭ ���ִ� ���� 
	 *  �⺻ ������(default constructor)�� ������� �ʾƵ� JVM�� �˾Ƽ� 
	 *  �������� 
	 *  >�ٸ� �Ű������� �ִ� �����ڸ� �����ϴ� �������ʹ� jvm�� �⺻�����ڸ� ��������� ����
	 *  > ������ ���� �޼��� �̱� ������ �����ε��� ����
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
		System.out.println("�õ��� �������ϴ�.");
	}

	public void powerOff() {
		System.out.println("�õ��� �������ϴ�..");
	}
}
