package com.oop.shop01;

// extends ��ӹް� ���� Ŭ������
public class IceCream extends Product{
//ǰ��, �̸�, ����
	public IceCream() {
		super();
		// super > ������ִ� �θ� Ŭ���� �����ϴ� ����
		// �θ�Ŭ������ �⺻������ ȣ���ϴ� �۾�(����� Product)
		// �θ� Ŭ������ �ν��Ͻ� ���� ������
		// this > �ڱ� �ڽ�
	}
	public IceCream(String product_no, String name, int price) {
		// private ���� ������ ������ ����ʵ忡 ������ �Ұ�
		
		//getter/setter�� ���� ������
//		this.setName(name);
//		this.setProduct_no(product_no);
//		this.setPrice(price);
// �θ��� �Ű����� �ִ� ������ Ȱ��
		super(product_no, name, price);
		//�׻� ù��°�� �;���
	
	
	}
	/* �޼����� �������̵�
	 * - �θ� Ŭ������ ������ �ִ� �޼��带 �������ϴ� �۾�
	 * �Ȱ��� �̸��� �޼���, �Ȱ��� ��ȯŸ��, �Ȱ��� �Ű�����
	 * �θ� Ŭ������ ������ �ִ� ���� �̸��� �޼��带 ��ȿȭ ��Ŵ
	 */ 
	
	//�����ε�
	/*  �ϳ��� Ŭ���� �ȿ��� �̷���
	 *  �Ȱ��� �̸��� �޼��带 �Ű����� �ڷ����̳� ������ �޸����ִ� �۾�
	 *  ���� Ÿ�� x
	 */ 
	public double getPromotionPrice() {
		return this.getPrice() * 0.01;
	}
}
