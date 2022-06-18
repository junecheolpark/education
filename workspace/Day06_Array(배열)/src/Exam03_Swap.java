
public class Exam03_Swap {
	public static void main(String[] args) {

//		
//		char[] arr = new char[] {'A', 'B'};
//		System.out.println(arr[0] + " " + arr[1]);
		// A와 B의 순서 뒤집기

//		char temp;
//		
//		temp = arr[0];
//		System.out.println(temp);
//		arr[0] = arr[1];
//		System.out.print(arr[0]+" ");
//		arr[1] = temp;
//		System.out.println(arr[1]);		
		
		char[] hello = {'h', 'e', 'l', 'l', 'o'};
		// -> 뒤집어서 olleh 가 담기도록 만들어보세요.
		
		for(char i : hello) {
			System.out.print(i+ " ");
		}
		
		System.out.println(" ");
		char tep;
//		tep = hello[0];
//		hello[0] = hello[4];
//		hello[1] = hello[3];
//		hello[4] = tep;
//		
//
//		for(char i : hello) {
//			System.out.print(i+ " ");
//		} 또는
		
		//**복습하기 어려움
		for(int i = 0; i < hello.length/2; i++) {
			tep = hello[i];
			hello[i] = hello[hello.length-1-i];
			hello[hello.length-1-i] = tep;
		}
		for(char i : hello) {
			System.out.print(i+ " ");
		}
				
	}
}
