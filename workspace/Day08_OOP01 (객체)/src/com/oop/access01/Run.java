package com.oop.access01;

public class Run {
	public static void main(String[] args) {

		/* ����������
		 * -public : �ܺ�, �������� ������ ����
		 * -private " �ݵ�� �ش� Ŭ���� ���ο����� ������ ����
		 * -protected : ���� ��Ű�� Ȥ�� �ڽ� Ŭ���������� ���� ����
		 * -default : ���� ��Ű�� �ȿ����� ��� ������ ����
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
