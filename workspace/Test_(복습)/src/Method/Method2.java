package Method;

public class Method2 {
	public static void sum(int i) {

		int a = 0;

		for (int j = 1; j <= i; j++) {

			a = a + j;
			
		}

		System.out.println(1 + " ���� " + i + " ������ ���� " + a);

	}

	public static int getSum(int j) {

		int a = 0;

		for (int i = 1; i <= j; i++) {

			a = a + i;

		}

		return a; // ��ȯ���� �ִ°�

	}

	public static void main(String[] args) {

		sum(10); // 1~10 ������ ���� �����Ͽ� ����ϴ� �޼ҵ� ����

		int r = getSum(10); // 1~10 ������ ���� �����Ͽ� �ǵ����ִ� �޼ҵ� ����

		System.out.println(r);

	}

}
