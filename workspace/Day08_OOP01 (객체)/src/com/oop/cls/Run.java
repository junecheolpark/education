package com.oop.cls;

public class Run {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		System.out.println(laptop);
		System.out.println(laptop.brand);
		
		laptop.brand = "LG";
		laptop.color = "White";
		laptop.price = 50000;
		laptop.size = 16.5;
		
		
		System.out.println(laptop.brand);
		System.out.println(laptop.color);
		System.out.println(laptop.price);
		System.out.println(laptop.size);
		
		Laptop laptop2 = new Laptop();
		
		laptop2.powerOn();
		laptop2.powerOff();
		
		laptop2.brand = "Aplle";
		laptop2.color = "Space gray";
		laptop2.price = 100000;
		laptop2.size = 13.5;
		
		
		System.out.println(laptop2.brand);
		System.out.println(laptop2.color);
		System.out.println(laptop2.price);
		System.out.println(laptop2.size);

		
	}
}
