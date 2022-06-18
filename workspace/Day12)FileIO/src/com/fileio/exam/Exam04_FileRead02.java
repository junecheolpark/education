package com.fileio.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exam04_FileRead02 {
	public static void main(String[] args) {
		// FileReader : text file character ������ �о���� Ŭ����
	// BufferrdReader : �����͸� ���� ������ �о� �鿩�ü� �ְ� ����
		try(FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);){
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read()); //�� ���ھ� �ҷ���
			
//			System.out.println(br.readLine()); //���پ� �ҷ���
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
