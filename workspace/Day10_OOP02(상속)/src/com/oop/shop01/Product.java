package com.oop.shop01;
//�߻�޼��带 �ϳ��� ���� Ŭ������ �ݵ�� �߻�Ŭ������ �Ǿ����
// �߻�Ŭ���� > ���̻� ����new�� ����.
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
	//0.02������ ���η��� ����� ������ ��ȯ���ִ� �޼���
	public double getPromotionPrice() {
		return this.Price * 0.02;
	}
	// �߻�޼���: �޼����� ������ ������ �ʰ� Ʋ�� ����� ���� �޼���
	
}
