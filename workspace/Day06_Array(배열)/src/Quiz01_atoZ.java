
public class Quiz01_atoZ {
	public static void main(String[] args) {

//		//char �� �迭 26ĭ ¥�� ���� ���ĺ� A���� Z���� ����
//		// �����ϸ� ��±���. ** �ƽ�Ű�ڵ� Ȱ��
//		
		char arr[] = new char[26];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (char)(65 + i);
//		}
//		System.out.println(arr[0]);
//		System.out.println(arr[26]);
		
		//�Ϲ����� for �������� ���ǽ��� ���� �������� �ݺ��������� �����ϴ°� ����
//		for(int i = 0; i <arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		System.out.println();
		
		// foreach : ���� for��
		// �迭�� ù �ε������� ���� ������ �ε��� ���� ���������� �ݺ�
		for(char i : arr) {
			System.out.println((i+ " "));
		}

	}
}
