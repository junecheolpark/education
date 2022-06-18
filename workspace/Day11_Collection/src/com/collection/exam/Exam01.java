package com.collection.exam;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
//	ArrayList : 똑똑한 동적 배열

//		1. 생성
		String[] arr = new String[5];
		ArrayList list = new ArrayList<>();
//		중간에 꺽쇠 괄호가 나오고 사이즈를 기재해주지 않음.

//		2. apple값 추가
		arr[0] = "apple"; // 배열의 인덱스를 활용해 값 추가
		list.add("apple"); // add라는 메서드를 활용해 0번인덱스부터 순차적으로 값 추가
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("list.get[0]: " + list.get(0));

//		값을 더 추가
		arr[1] = "banana";
		arr[2] = "kiwi";
		arr[3] = "mango";
		list.add("banana");
		list.add("kiwi");
		list.add("mango");

		System.out.println("arr.length: " + arr.length);
		System.out.println("list.size[0]: " + list.size());

//		 1번 인덱스에 있는값 삭제

		arr[1] = null;
		System.out.println("arr[1]: " + arr[1]);
		System.out.println("arr.length: " + arr.length);

		System.out.println("삭제 전 list.get(1) : " + list.get(1));
		System.out.println("삭제 전 list.size(1) : " + list.size());
		list.remove(1);
		System.out.println("삭제 후 list.get(1) : " + list.get(1));
		System.out.println("삭제 후 list.size(1) : " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.toString());
	}
}
