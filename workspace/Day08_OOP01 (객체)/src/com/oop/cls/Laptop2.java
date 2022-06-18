package com.oop.cls;

public class Laptop2 {
	private String brand;
	private String color;
	private int price;
	private double size;
	
	public Laptop2() {}
	public Laptop2(String brand, String Color, int price, double size) {
	}{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}//
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}//
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}//
	public double getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}//
	
}
