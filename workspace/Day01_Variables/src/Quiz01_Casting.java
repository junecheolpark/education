
public class Quiz01_Casting {
 public static void main(String[] args) {
	// 퀴즈 1 : 주어진 값을 모두 int 형으로 변환해서 모두 더한 값을 출력
	 char a = '2';
	 double b = 5.6;
	 long c = 1250000L;
	 int d = 10000;
	 
	 int i1 = a;
	 int i2 = (int)b;
	 int i3 = (int)c;
	 int i4 = d;
	 
	 int rs = i1 + i2 + i3 + i4;
	 
	 System.out.println("i1 + i2 + i3 + i4 : " + rs);
	
	 rs = a + (int)b + (int)c + d;
	 
	 System.out.println(rs);
	 
	 rs = (int)(a + b + c + d);
	
	 
}
}
