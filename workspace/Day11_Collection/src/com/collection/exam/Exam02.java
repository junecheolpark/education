package com.collection.exam;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "apple";
//		arr[1] = 10; �ڷ����� ��ġ�����ʾ� x
		
		ArrayList list = new ArrayList<>();
		list.add("apple");
		list.add(10); // �����߻� x
		list.add(36.5);
		list.add('A');
		list.add(true);
		
		System.out.println(list.toString());
		
		//String, boolean, �Ǽ�, ����...
		/*
		 * Object -> �ڹ��� ��� Ŭ����/ ��� �͵��� Object�� ��ӹ��� > �ְ�����
		 * �츮�� ���� ArrayList �� ���� Object �� �迭
		 */
		
		String a = "mango";
		char temp1 = a.charAt(0);
		System.out.println("temp1 : " + temp1);
//		
//		list.get(0).charAt(0);
		// �ڽ������� �ٿ�ĳ������ �ؾ� ������ ��� ����
		char temp2 = ((String)list.get(0)).charAt(0);
		System.out.println("temp2 : " + temp2);
		
		int temp3 = ((int)list.get(1));
		double temp4 = ((double)list.get(2));
		boolean temp5 = ((boolean)list.get(3));
		
		System.out.println(list.toString());
		
		
		
	}
}
