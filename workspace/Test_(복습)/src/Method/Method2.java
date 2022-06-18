package Method;

public class Method2 {
	public static void sum(int i) {

		int a = 0;

		for (int j = 1; j <= i; j++) {

			a = a + j;
			
		}

		System.out.println(1 + " 부터 " + i + " 까지의 합은 " + a);

	}

	public static int getSum(int j) {

		int a = 0;

		for (int i = 1; i <= j; i++) {

			a = a + i;

		}

		return a; // 반환값이 있는것

	}

	public static void main(String[] args) {

		sum(10); // 1~10 까지의 합을 누적하여 출력하는 메소드 정의

		int r = getSum(10); // 1~10 까지의 합을 누적하여 되돌려주는 메소드 정의

		System.out.println(r);

	}

}
