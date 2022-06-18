
public class Exam02_Array {
public static void main(String[]args) {
	// 배열의 수정 / 삭제
	// crud -> create read update delete
	
//	int[] arr1= {1, 2, 3, 4, 5};
//	System.out.println("arr1 수정전 : " + arr1[0]);
//	
//	arr1[0] = 10;
//	System.out.print("arr1 수정후 : " + arr1[0]);

	// charArr 안에 담겨있는 'h' 'e' 'l' 'l' 'o' 를 '안' '녕' '하' '세' '요' 로 수정
	char[] charArr = {'h', 'e', 'l', 'l', 'o'};
	System.out.println("수정 전 : ");
	for(char i : charArr) {
		System.out.print(i+ " ");
	}
	
	charArr[0] = '안';
	charArr[1] = '녕';
	charArr[2] = '하';
	charArr[3] = '세';
	charArr[4] = '요';
	System.out.println("수정 후 : ");
	for(char i : charArr) {
		System.out.print(i+ " ");
	}
}
}
