package com.collection.exam;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
//	ArrayList : �ȶ��� ���� �迭

//		1. ����
		String[] arr = new String[5];
		ArrayList list = new ArrayList<>();
//		�߰��� ���� ��ȣ�� ������ ����� ���������� ����.

//		2. apple�� �߰�
		arr[0] = "apple"; // �迭�� �ε����� Ȱ���� �� �߰�
		list.add("apple"); // add��� �޼��带 Ȱ���� 0���ε������� ���������� �� �߰�
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("list.get[0]: " + list.get(0));

//		���� �� �߰�
		arr[1] = "banana";
		arr[2] = "kiwi";
		arr[3] = "mango";
		list.add("banana");
		list.add("kiwi");
		list.add("mango");

		System.out.println("arr.length: " + arr.length);
		System.out.println("list.size[0]: " + list.size());

//		 1�� �ε����� �ִ°� ����

		arr[1] = null;
		System.out.println("arr[1]: " + arr[1]);
		System.out.println("arr.length: " + arr.length);

		System.out.println("���� �� list.get(1) : " + list.get(1));
		System.out.println("���� �� list.size(1) : " + list.size());
		list.remove(1);
		System.out.println("���� �� list.get(1) : " + list.get(1));
		System.out.println("���� �� list.size(1) : " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.toString());
	}
}
