package kh.com.oop.Message;

import java.util.Scanner;

public class Message_run {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 Mesege ms = new Mesege();
		 
	        System.out.println("==== �޼��� �Է� ====");
	        System.out.print("�ۼ��� : ");
	        String writer = sc.nextLine();
	        
	        System.out.print("�޼��� : ");
	        String message = sc.nextLine();
	        
	        System.out.print("�ۼ��� : ");
	        String written_date = sc.nextLine();
	        
	        ms.setWriter(writer);
	        ms.setMessage(message);
	        ms.setWritten_date(written_date);
	        ms.PrintAll(writer, message, written_date);
	}
}
