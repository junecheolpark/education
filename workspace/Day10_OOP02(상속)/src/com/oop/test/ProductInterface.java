package com.oop.test;

import com.oop.shop01.Product;

public interface ProductInterface {
	/*
	 * 인터페이스 : 추상 메서드들로만 이뤄진 클래스를 인터페이스 상수, 디폴트 메서드, 정적메서드
	 */
	// 상수
	public final int MAX_COUNT = 30;

	// default 메서드
	void selectAll();

	// 정적 메서드
	static void add(Product product) {
		Product[] list = new Product[] { product };
	}
	
	//추상 메서드
	public abstract void update(Product product);
	public abstract void delete(int no);

}
