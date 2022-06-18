package com.oop.shop01;

public class re {
	
public static void main(String[] args) {
	int year = 0;
	double inflation = 0.00;
	
	for(int i = 0; i<=10; i++) {
		if(i>=1) {
			System.out.println(i +"년" + " 인플레이션 " + inflation + " 합 " + year);
		}
		
		inflation += (int)(8400000*0.03);
		year += (int)(8400000+inflation);
	}
}
}
