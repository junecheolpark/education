package day01;

public class Exam03_stock {
	public static void main(String[] arg) {
		System.out.println("================= �ֽ� ���� =================");
		System.out.print("1. �Ｚ���� (1��: ");
		System.out.print(40000);
		System.out.println(')');
		
		System.out.println("2. �׽��� (1��: " + 50000 + ")");
		System.out.println("3. īī�� (1��: " + 30000 + ")");
		System.out.println("�ܰ� : "+ 200000 + '��');
		System.out.println("===========================================");
		
		System.out.println(" �Ｚ���� 1�� �ż�");
		System.out.println("�ܰ� : " + (200000 - 40000) + "��");
		
		System.out.println(" �׽��� 2�� �ż�");
		System.out.println("�ܰ� : " + (200000 - 40000 - 100000) +"��");
		
		System.out.println(" īī�� 1�� �ż�");
		System.out.println("�ܰ� : " + (200000 - 40000 - 100000 - 30000) + "��");
		
		System.out.println(" �׽��� 1�� �ŵ�");
		System.out.println("�ܰ� : " + (200000 - 40000 - 100000 - 30000 + 50000) + "��");
	}
}
