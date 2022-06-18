package com.oop.cls;

public class Car_Run {
	public static void main(String[] args) {

		Car morning = new Car("Kia", 100, 50);
		System.out.println(morning.getBrand() + morning.getSpeed()
		+ morning.getOil());
		
		
		
		Car avante = new Car();
//		avante.brand =  "Hyundai";
//		System.out.println(avante.brand);
		avante.setBrand("Hyundai"); 
		System.out.println(avante.getBrand());
//		avante.oil = 10;
//		System.out.println(avante.oil);
		avante.setOil(10);
		System.out.println(avante.getOil());
//		avante.speed = 0;
//		System.out.println(avante.speed);
		avante.setSpeed(120);
		System.out.println(avante.getSpeed());



		
		avante.powerOn();
		avante.speedUp();
//		System.out.println(avante.speed);
		System.out.println(avante.getSpeed());
		for(int i = 0 ; i<100; i++) {
			avante.speedUp();
		}
//		System.out.println(avante.speed);
		System.out.println(avante.getSpeed());
	}
}
