import java.util.Scanner;

public class Quiz03_Dictionary {
	public static String dict(String input){
		String eng = " ";
		if(input.equals("���")) {
			eng = "carrot";
		}else if(input.equals("����")) {
			eng = "cucumber";
		}else if(input.equals("�丶��")) {
			eng = "tomato"	;		
		}else {
			eng = "������ ��ϵ��� ���� �ܾ�";
		}
		return eng;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==���ϴ� ä���� �̸��� �Է��ϼ���==");
		String input = sc.nextLine();
		String eng = dict(input);
		System.out.println("�Է��� " + input + " ��/�� ����� " + eng + "�Դϴ�.");
	
		
		/* ����ڿ���
		 * ==== ���ϴ� ä���� �̸��� �Է��ϼ���. ====
		 * >>
		 * 
		 * > dict() �޼��带 �̿��ؼ� ����ڰ� �Է��� ä�Ҹ� ���� �ܾ�� �ٲ㼭 ��ȯ���ִ� �޼��带 ����
		 * > ��������� " �Է��� 00�� ����� 00�Դϴ�." ���
		 * 
		 * > �������� ��������θ�������
 		 */
	}
}
