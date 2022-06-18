package com.oop.shop01;
//추상메서드를 하나라도 가진 클래스는 반드시 추상클래스가 되어야함
// 추상클래스 > 더이상 직접new를 못함.
public class Product {
	private String product_no;
	private String name;
	private int Price;
	
	
	public Product() {}
	public Product(String product_no, String name, int price) {
		this.product_no = product_no;
		this.name = name;
		Price = price;
	}
	public String getProduct_no() {
		return product_no;
	}
	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	//0.02프로의 할인률이 적용된 가격을 반환해주는 메서드
	public double getPromotionPrice() {
		return this.Price * 0.02;
	}
	// 추상메서드: 메서드의 몽통을 만들지 않고 틀만 만들어 놓은 메서드
	
}
