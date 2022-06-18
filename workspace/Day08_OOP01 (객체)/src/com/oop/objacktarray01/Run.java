package com.oop.objacktarray01;

public class Run {
	public static void main(String[] args) {
//		Laptop lg = new Laptop("lg" , 20000, "white");
//System.out.println(lg.printAll());
		Laptop[] laptops = new Laptop[5];
		laptops[0] = new Laptop("LG", 20000, "White");
//		System.out.println(laptops[0].printAll());
		
		laptops[1] = new Laptop("Apple", 50000, "space grey");
//		System.out.println(laptops[1].printAll());

		laptops[2] = new Laptop("Samsung", 30000, "black");
//		System.out.println(laptops[1].printAll());
		System.out.println(laptops[0].getPrice());
		laptops[2].setBrand("Dell");
		laptops[2].setColor("White");
		
		for(int i = 0; i< laptops.length; i++) {
			if (laptops[i] != null) {
				System.out.println(laptops[i].printAll());
			}
			
		}
		
	}
}
