
public class Exam02_Array {
public static void main(String[]args) {
	// �迭�� ���� / ����
	// crud -> create read update delete
	
//	int[] arr1= {1, 2, 3, 4, 5};
//	System.out.println("arr1 ������ : " + arr1[0]);
//	
//	arr1[0] = 10;
//	System.out.print("arr1 ������ : " + arr1[0]);

	// charArr �ȿ� ����ִ� 'h' 'e' 'l' 'l' 'o' �� '��' '��' '��' '��' '��' �� ����
	char[] charArr = {'h', 'e', 'l', 'l', 'o'};
	System.out.println("���� �� : ");
	for(char i : charArr) {
		System.out.print(i+ " ");
	}
	
	charArr[0] = '��';
	charArr[1] = '��';
	charArr[2] = '��';
	charArr[3] = '��';
	charArr[4] = '��';
	System.out.println("���� �� : ");
	for(char i : charArr) {
		System.out.print(i+ " ");
	}
}
}
