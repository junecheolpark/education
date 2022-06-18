package com.oop.shop01;

public class Shop { // 아이스크림 가게 재고 관리 프로그램 
	// 가게이름 name, openTime, closeTime, iceCream	
	private String name;
	private String openTime;
	private String closeTime;
	private Product[] product;
	
//	private IceCream[] iceCream;
//	private Bread[] bread;
//	private Beverage[] beverage;
	private int icIndex = 0;
//	private int brIndex = 0;
//	private int bvIndex = 0;
	
	public Shop() {}
	public Shop(String name, String openTime, String closeTime, Product[] product) {
		super();
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.product = product;
//		this.iceCream = iceCream;
//		this.bread = bread;
//		this.beverage = beverage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	public Product[] getProduct() {
		return product;
	}
	public void setProduct(Product[] product) {
		this.product = product;
	}
//	public IceCream[] getIceCream() {
//		return iceCream;
//	}
//	public void setIceCream(IceCream[] iceCream) {
//		this.iceCream = iceCream;
//	}
//	public Bread[] getBread() {
//		return bread;
//	}
//	public void setBread(Bread[] bread) {
//		this.bread = bread;
//	}
//	public Beverage[] getBeverage() {
//		return beverage;
//	}
//	public void setBeverage(Beverage[] beverage) {
//		this.beverage = beverage;
//	}
//	public void addIceCream(IceCream iceCream) {
//		this.iceCream[icIndex++] = iceCream;
//	}
	public void addProduct(Product product) {
	this.product[icIndex++] = product;
}
	public String printProduct() {
	String rs = "";
	for(int i = 0; i < product.length; i++) {
		if(product[i] != null) {
			rs += product[i].getProduct_no()
			+ " : " + product[i].getName()
			+ " : " + product[i].getPrice()
			+ "\n";
		}
	}
	return rs;	
}
	
//	public String printIceCream() {
//		String rs = "";
//		for(int i = 0; i < iceCream.length; i++) {
//			if(iceCream[i] != null) {
//				rs += iceCream[i].getProduct_no()
//				+ " : " + iceCream[i].getName()
//				+ " : " + iceCream[i].getPrice()
//				+ "\n";
//			}
//		}
//		return rs;	
//	}
//	
//	public void addBread(Bread bread) {
//		this.bread[brIndex++] = bread;
//	}
//	
//	public String printBread() {
//		String rs = "";
//		for(Bread br : bread) {
//			if(br != null) {
//				rs += br.getProduct_no()
//						+ " : " + br.getName()
//						+ " : " + br.getPrice()
//						+ "\n";
//			}
//		}
//		return rs;				
//	}
//	
//	public void addBeverage(Beverage beverage) {
//		this.beverage[bvIndex++] = beverage;
//	}
//	
//	public String printBeverage() {
//		String rs = "";
//		for(Beverage bv : beverage) {
//			if(bv != null) {
//				rs += bv.getProduct_no()
//						+ " : " + bv.getName()
//						+ " : " + bv.getPrice()
//						+ "\n";
//			}
//		}
//		return rs;				
//	}
}
