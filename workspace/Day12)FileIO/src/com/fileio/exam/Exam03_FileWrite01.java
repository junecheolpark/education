package com.fileio.exam;

import java.io.FileOutputStream;

public class Exam03_FileWrite01 {
	public static void main(String[] args) {
//���α׷� ���忡�� ������ ����ϴ� ���̱� ������ OutputStream �ʿ�

		try (FileOutputStream fos = new FileOutputStream("output.txt", true);) {
// ���� ������ ���Ͽ� �̾ ������ �ۼ��ϰ� �ʹٸ� true ���ڰ�
			fos.write('A');
//			byte[] fileContnts ={'a','b','c','d'};
//			fos.write(fileContnts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
