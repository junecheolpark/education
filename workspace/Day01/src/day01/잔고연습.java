package day01;

public class �ܰ��� {
	public static void main(String[] args) {
		int samsung = 40000;
		int tesla = 50000;
		int kakao = 30000;
		int d = 200000;
		
		System.out.println("================= �ֽ� ���� =================");
		System.out.println("�Ｚ���� (1��: " + samsung + ")");
		System.out.println("�׽��� (1��: " + tesla + ")");
		System.out.println("īī�� (1��: " + kakao + ")");
		System.out.println("�ܰ� : " + d + "��");
		System.out.println("===========================================");
		
		System.out.println("�Ｚ���� 1�� �ż�");
		System.out.println("�ܰ� : " + (d - samsung) + "��");
		System.out.println("�׽��� 2�� �ż�");
		System.out.println("�ܰ� : " + (d - samsung - (tesla*2)) + "��");
		System.out.println("īī�� 1�� �ż�");
		System.out.println("�ܰ� : " + (d - samsung - (tesla*2) - kakao) + "��");
		System.out.println("�׽��� 1�� �ŵ�");
		System.out.println("�ܰ� : " + (d - samsung - (tesla*2) - kakao + tesla) + "��");
		
		
		
	
	}
}
