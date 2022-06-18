package com.oop.objacktarray01;

public class Laptop {

	//brand, price, color
	//printAll() -> String 반환타입
	private String brand;
	private int price;
	private String color;
	
	public Laptop() {}
	public Laptop(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
				
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String printAll() {
		return this.brand +":"+ this.price +":"+ this.color;
	}
	
}
