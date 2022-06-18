
public class Quiz01_atoZ {
	public static void main(String[] args) {

//		//char 형 배열 26칸 짜리 만들어서 알파벳 A부터 Z까지 저장
//		// 가능하면 출력까지. ** 아스키코드 활용
//		
		char arr[] = new char[26];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (char)(65 + i);
//		}
//		System.out.println(arr[0]);
//		System.out.println(arr[26]);
		
		//일반적인 for 문에서는 조건식을 통해 언제까지 반복해줄지를 지정하는게 가능
//		for(int i = 0; i <arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		System.out.println();
		
		// foreach : 향상된 for문
		// 배열의 첫 인덱스부터 가장 마지막 인덱스 까지 순차적으로 반복
		for(char i : arr) {
			System.out.println((i+ " "));
		}

	}
}
