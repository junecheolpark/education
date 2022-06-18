package com.fileio.quiz;

import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz01_FileRead {
	// ���ۿ��� ���ϴ� ª������� �� ��,����,����,�Ҽ� �ϳ��� ���ؼ� ������Ʈ ��������
	// txt���Ϸ� ����> �������� �о�鿩 �ַܼ� ����ϱ�
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("english.txt");
				BufferedReader br = new BufferedReader(fr);)
//			(FileInputStream fis = new FileInputStream("english.txt");)
			{
				String line = "";
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
//			byte[] poem = new byte[1024];
//			fis.read(poem);
//			System.out.println(new String(poem));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
