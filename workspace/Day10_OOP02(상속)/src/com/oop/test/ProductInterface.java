package com.oop.test;

import com.oop.shop01.Product;

public interface ProductInterface {
	/*
	 * �������̽� : �߻� �޼����θ� �̷��� Ŭ������ �������̽� ���, ����Ʈ �޼���, �����޼���
	 */
	// ���
	public final int MAX_COUNT = 30;

	// default �޼���
	void selectAll();

	// ���� �޼���
	static void add(Product product) {
		Product[] list = new Product[] { product };
	}
	
	//�߻� �޼���
	public abstract void update(Product product);
	public abstract void delete(int no);

}
