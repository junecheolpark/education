package Method;

public class practice {
	public static void Mul() {
		int num = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}
	public static int Mul1() {
		int rs = 0;
		int num = 3;
		for (int i = 1; i < 10; i++) {
			rs =num*i;
			
		}
		return rs;
	}
	public static void main(String[] args) {
		Mul();
		int re = Mul1();
		System.out.println(re);
	}

}
