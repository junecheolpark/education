import java.util.Scanner;

public class asd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] strArr = { "������ħ", "������", "�μ�����", "�̱ۺ���", "�͸��䰢", "���굹��", "�ݱ�����", "�ٶ����", "�������" };

		int num = strArr.length;

		System.out.println("===== ����ġ�� ���ӿ� ���� �� ȯ���մϴ� =====");

		System.out.println("1. ���� ����");

		System.out.println("2. ���� ����");

		System.out.print("�޴��� �����ϼ��� >> ");

		int menu = sc.nextInt();

		String xx = sc.nextLine();

		if (menu == 1) {

			System.out.println("\n���� Start!");

			long start = System.currentTimeMillis();

			while (true) {

				if (num != 0) {

					for (int i = 0; i < strArr.length; i++) {

						System.out.print(strArr[i] + " ");

					}

					System.out.println();

					System.out.print("�Է� >> ");

					String str = sc.nextLine();

					for (int j = 0; j < strArr.length; j++) {

						if (strArr[j].equals(str)) {

							strArr[j] = "";

							num--;

						}

					}

				} else {

					long end = System.currentTimeMillis();

					System.out.println("\nClear !");

					System.out.println("�÷��� �ð� : " + (end - start) / 1000 + "��");

					System.out.println("===== Goodbye Venezia:) =====");

					break;

				}

			}

		} else if (menu == 2) {

			System.out.println("\n������ �����մϴ�.");

		}

	}
}
