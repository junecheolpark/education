
public class Exam04_Copy {
public static void main(String[] args) {
	//배열복사
	// 얕은복사 / 깊은 복사
	 
	// 같은 주소값을 가지는 공간을 가르키게 된다면 얕은 복사
	// 한 참조 변수를 통해 값을 수정하면 다른 참조 변수의 주소값의 데이터도 수정된다.
	
//	/*
	 int[] arr = {1, 2, 3}; 	
	 System.out.println("arr 주소 : " + arr);
	 System.out.println("복사 전 : " + arr[0]);

//	 b= 5;
//	 int[] arr2 = arr;
//	 arr[0] = 10;
//	 System.out.println("arr2 주소 : " + arr2);
//	 System.out.println("복사 후 : " + arr[0]);
//	 */
	
//	 int a = 3;
//	 int b = a;
//	 System.out.println(a);
	
	//깊은복사
	// 실제 배열안에 들어있는 값만 복사가 이뤄지는것
	 //원본데이터에 영향을 및지ㅣ 않음
	int[] arr3 = new int[3];
	for(int i = 0; i < 3; i++) {
		arr3[i] = arr[i];
	}
	arr3[0] = 10;
	 System.out.println("arr3 주소 : " + arr3);
	 System.out.println("복사 후 : " + arr[0]);
	
	
	
	
	
}
}
