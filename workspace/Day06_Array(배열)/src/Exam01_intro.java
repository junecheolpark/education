
public class Exam01_intro {
	public static void main(String[] args) {
	
		/*
		 * �迭 (Arry) : ���� �ڷ����� ����
		 * -> ���� �ڷ��� �������� ��Ƽ� �ϳ��� �̸����� ����
		 */
		 
//		int[] arr = new int[5];
		/*  int[] > int �� �迭�� �ǹ� (�ڷ���)
		 *  arr -> ������
		 *  �Ǵ� int[] arr = new int[1,2,3,4,5]
		 */
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		//int�� �迭 100ĭ¥���� ���� 0~99���� ��ƺ��� -> �����ϴٸ� ��±���.
		
		
//		int[] arr= new int[99];
//		
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = i;
//			System.out.println(arr[i]);
//		}
//		int�� �迭 100ĭ¥���� ���� 99~0���� ��ƺ��� -> �����ϴٸ� ��±���.

		int[] arr =new int[100];
		
		for(int i = 99; i >= 0 ; i--){
			arr[i] = 99-i;
			System.out.println(arr[i]);

		}
		System.out.println("arr[0]" + arr[0]);
		System.out.println("arr[99]" + arr[99]);
}
}
