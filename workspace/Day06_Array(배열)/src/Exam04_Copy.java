
public class Exam04_Copy {
public static void main(String[] args) {
	//�迭����
	// �������� / ���� ����
	 
	// ���� �ּҰ��� ������ ������ ����Ű�� �ȴٸ� ���� ����
	// �� ���� ������ ���� ���� �����ϸ� �ٸ� ���� ������ �ּҰ��� �����͵� �����ȴ�.
	
//	/*
	 int[] arr = {1, 2, 3}; 	
	 System.out.println("arr �ּ� : " + arr);
	 System.out.println("���� �� : " + arr[0]);

//	 b= 5;
//	 int[] arr2 = arr;
//	 arr[0] = 10;
//	 System.out.println("arr2 �ּ� : " + arr2);
//	 System.out.println("���� �� : " + arr[0]);
//	 */
	
//	 int a = 3;
//	 int b = a;
//	 System.out.println(a);
	
	//��������
	// ���� �迭�ȿ� ����ִ� ���� ���簡 �̷����°�
	 //���������Ϳ� ������ ������ ����
	int[] arr3 = new int[3];
	for(int i = 0; i < 3; i++) {
		arr3[i] = arr[i];
	}
	arr3[0] = 10;
	 System.out.println("arr3 �ּ� : " + arr3);
	 System.out.println("���� �� : " + arr[0]);
	
	
	
	
	
}
}
