package com.collection.exam;

import java.util.ArrayList;

public class Exam03 {
	/**/
	public static void main(String[] args) {
		ArrayList tempArr = new ArrayList<>();
		//��׸� > ArrayList�� �迭 > ArrayList�� ������ �ڷ����� ������ִ°�
	ArrayList<String> strList = new ArrayList<>();
	/**/
	
	tempArr.add("apple");
	tempArr.add(10);
	tempArr.add(true);
	
	//���׸��� ����ϸ� ������ ��Ƽ���� Ÿ���� �ɷ���
	
	// apple ������ a�����̾Ƴ��� �ʹ�.
//	char a = ((String)tempArr.get(0)).charAt(0);
//	System.out.println("a : " + a);
	
	//���׸��� ����ϰԵǸ� ��������ȯ x
//	char a2 = strList.get(0).charAt(0);
//	System.out.println("a2: " + a2);
	
	/* �⺻�ڷ��� ArrayList
	 * 
	 * (boolean char byte short int long float double)
	 * > �⺻�ڷ����� Ŭ������ x > �ڹٿ��� �����س��� Ư���� �⺻ �ڷ���
	 * 
	 * Wrapper Class
	 * > �⺻ �ڷ������� ���ΰ� �ִ� Ŭ���� > �⺻�ڷ����� ��ġ Ŭ����ó�� ����ϴ°� �����ϵ��� ����.
	 * 
	 * int > integer
	 * double > Double
	 * float > Float\
	 * char > Character
	 */
	// int �� ArrayList intList �� ��������.
	ArrayList<Integer> intList = new ArrayList<>();
	intList.add(10);
	intList.add(50);
	System.out.println(intList.get(0) + " : " + intList.get(1));
	
	ArrayList<Double> doubleList = new ArrayList<>();
	ArrayList<Character> charList = new ArrayList<>();
	ArrayList<Boolean> boolList = new ArrayList<>();
	
	
	}
}
