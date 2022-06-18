package com.fileio.exam;

import java.io.FileInputStream;

public class Exam02_FileRead01 {
	public static void main(String[] args) {
		//try~with~resource
		//try(��ü �ڵ��ݳ��� ���ְ� ���� ������)
		try( FileInputStream fis = new  FileInputStream("test.txt")){
			//�ƽ�Ű�ڵ�
//			System.out.println(fis.read()); //�ϳ����ҷ���
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			//������ �ѹ��� �о����
			byte[] fileContents = new byte[100];
			fis.read(fileContents);
			// test.txt ���Ϸκ��� �о�鿩�� �����͸� fileContents �迭�ȿ� ��� ����
			
			for(byte b : fileContents) {
				System.out.println(b + " ");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
// �����Է� > Stream> InputStream
		FileInputStream fis = null;
		try {
			// ���ϰ� ���õ� ��ü �ν��Ͻ��� ������� ������ ��ü �ݳ��� �������� �������
			fis = new FileInputStream("test.txt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//���� try �����ʿ��� ���ܰ� �߻��ϴ��� finally ���� �ڵ�� ������ �����
			try{
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
