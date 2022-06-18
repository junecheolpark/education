package com.collection.exam;

import java.util.ArrayList;

public class Exam03 {
	/**/
	public static void main(String[] args) {
		ArrayList tempArr = new ArrayList<>();
		//재네릭 > ArrayList도 배열 > ArrayList에 저장할 자료형을 명시해주는것
	ArrayList<String> strList = new ArrayList<>();
	/**/
	
	tempArr.add("apple");
	tempArr.add(10);
	tempArr.add(true);
	
	//제네릭을 사용하면 저장할 데티어의 타입을 걸러줌
	
	// apple 값에서 a값만뽑아내고 싶다.
//	char a = ((String)tempArr.get(0)).charAt(0);
//	System.out.println("a : " + a);
	
	//제네릭을 사용하게되면 강제형변환 x
//	char a2 = strList.get(0).charAt(0);
//	System.out.println("a2: " + a2);
	
	/* 기본자료형 ArrayList
	 * 
	 * (boolean char byte short int long float double)
	 * > 기본자료형은 클래스가 x > 자바에서 지정해놓은 특수한 기본 자료형
	 * 
	 * Wrapper Class
	 * > 기본 자료형들을 감싸고 있는 클래스 > 기본자료형을 마치 클래스처럼 사용하는게 가능하도록 해줌.
	 * 
	 * int > integer
	 * double > Double
	 * float > Float\
	 * char > Character
	 */
	// int 형 ArrayList intList 를 만들어보세요.
	ArrayList<Integer> intList = new ArrayList<>();
	intList.add(10);
	intList.add(50);
	System.out.println(intList.get(0) + " : " + intList.get(1));
	
	ArrayList<Double> doubleList = new ArrayList<>();
	ArrayList<Character> charList = new ArrayList<>();
	ArrayList<Boolean> boolList = new ArrayList<>();
	
	
	}
}
