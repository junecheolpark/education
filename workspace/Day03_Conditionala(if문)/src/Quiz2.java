import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		�ǽ� 1. �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
//		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���
		/*
		 
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int num = Integer.parseInt(sc.nextLine());
		
		String menu = "�޴�";
		
		switch (num) {
		case 1 : menu = "�Է�"; break;
		case 2 : menu = "����"; break;
		case 3 : menu = "��ȸ"; break;
		case 4 : menu = "����"; break;
		case 7 : menu = "����"; break;
		default: System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		System.out.println(menu + " �޴� �Դϴ�.");
		
		*/
		
		
//		�ǽ�2.Ű����� �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
//		¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
//		����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���
		
		/*
		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num % 2 == 0 && num >= 0) {
			System.out.println("¦����.");
		}else if (num % 2 != 0 && num >= 0) {
			System.out.println("Ȧ����.");
		}else {
			System.out.println("����� �Է����ּ���.!");
		}
		*/
		
//		�ǽ�3.����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
//		�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
//		(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
//		�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
//		���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.
		/*
		System.out.print("�������� : ");
		int k = Integer.parseInt(sc.nextLine());

		System.out.print("�������� : ");
		int m = Integer.parseInt(sc.nextLine());

		System.out.print("�������� : ");
		int e = Integer.parseInt(sc.nextLine());

		int sum = k + m + e;
		double di = sum / 3.0;
		if (k >= 40 && m >= 40 && e >= 40 && di >= 60) {
			System.out.println("���� : " + k);
			System.out.println("���� : " + m);
			System.out.println("���� : " + e);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + di);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ� �Դϴ�.");
		}
		*/
		
//�ǽ� 4.���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
		
		/*
		System.out.println("1~12 ������ ���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num + "���� �ܿ��Դϴ�.");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println(num + "���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "���� ���� �Դϴ�.");
			break;

		default:
			System.out.println(num + "���� �߸��� �Է��Դϴ�.");
		}
		*/
		
//		//�ǽ�5.���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
//		�α��� ���� �� ���α��� ������, 
//		���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
//		��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���
		
		/*
		System.out.print("���̵� : ");
		String id = sc.nextLine();

		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("�α��� ����");
		} else if (id.equals("myId")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (pw.equals("myPassword12")) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		*/
		
//		����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
//		��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//		ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//		��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
	/*
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���(������, ȸ��, ��ȸ��) : ");
		String a = sc.nextLine();

		switch (a) {
		case "������":
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "ȸ��":
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;
		default:
			System.out.println("���� ����Դϴ�.");
		}
		*/
		
//		Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
//		��ü��/����ü��/��ü��/���� ����ϼ���.
//		BMI = ������ / (Ű(m) * Ű(m))
//		BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
//		BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
//		BMI�� 30�̻��� ��� �� ��
		
	System.out.print("Ű(m)�� �Է��� �ּ��� : ");
	double m = sc.nextDouble();

	System.out.print("������(kg)�� �Է��� �ּ��� : ");
	double kg = sc.nextDouble();

	double mbi = kg / (m * m);
	System.out.println("MBI ���� : " + mbi);

	if (mbi >= 0 && mbi < 18.5) {
		System.out.println("��ü��");
	} else if (mbi >= 18.5 && mbi < 23) {
		System.out.println("����ü��");
	} else if (mbi >= 23 && mbi < 25) {
		System.out.println("��ü��");
	} else if (mbi >= 25 && mbi < 30) {
		System.out.println("��");
	} else if (mbi > 30) {
		System.out.println("�� ��");
	}
		
		
		
		
		
	}
}
