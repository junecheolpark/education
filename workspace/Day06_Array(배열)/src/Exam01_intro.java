
public class Exam01_intro {
	public static void main(String[] args) {
	
		/*
		 * 배열 (Arry) : 같은 자료형의 집합
		 * -> 같은 자료형 변수들을 모아서 하나의 이름으로 관리
		 */
		 
//		int[] arr = new int[5];
		/*  int[] > int 형 배열을 의미 (자료형)
		 *  arr -> 변수명
		 *  또는 int[] arr = new int[1,2,3,4,5]
		 */
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		//int형 배열 100칸짜리를 마들어서 0~99까지 담아보기 -> 가능하다면 출력까지.
		
		
//		int[] arr= new int[99];
//		
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = i;
//			System.out.println(arr[i]);
//		}
//		int형 배열 100칸짜리를 마들어서 99~0까지 담아보기 -> 가능하다면 출력까지.

		int[] arr =new int[100];
		
		for(int i = 99; i >= 0 ; i--){
			arr[i] = 99-i;
			System.out.println(arr[i]);

		}
		System.out.println("arr[0]" + arr[0]);
		System.out.println("arr[99]" + arr[99]);
}
}
