package kh.com.oop.method;

import java.util.Scanner;

public class Person_run {
	  public static void main(String[] args) {
          
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println("==== 회원 정보 입력 ====");
	        System.out.print("고유번호를 입력하세요 ( 4자리 숫자 ) >>");
	        int id = Integer.parseInt(sc.nextLine());
	        
	        System.out.print("이름을 입력하세요 >>");
	        String name = sc.nextLine();
	        
	        System.out.print("연락처를 입력하세요 >>");
	        String contact = sc.nextLine();
	        
	        Person p = new Person(id, name, contact);
	        p.setContact("01012344321");
	        p.setName("Larry");
	        p.printAll(id, name, contact);
	    }
	 
	}



