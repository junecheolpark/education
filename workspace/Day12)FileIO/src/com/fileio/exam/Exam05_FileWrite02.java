package com.fileio.exam;

import java.io.FileWriter;

public class Exam05_FileWrite02 {
	public static void main(String[] args) {
		String str = "�� �� ����� ������\r\n"
				+ "����� ������ �������鼭��\r\n"
				+ "������ ���⸸ ���� �ִ�\r\n"
				+ "�� ������ �����̿�\r\n"
				+ "�������� ���� �־�����";
		try(FileWriter fw = new FileWriter("newKorean.txt")){
			
			fw.write(str);
			fw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
