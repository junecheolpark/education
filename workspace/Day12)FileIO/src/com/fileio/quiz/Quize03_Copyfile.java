package com.fileio.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Quize03_Copyfile {
//	public static void main(String[] args) {
////A.txt ������ �����ؼ� B.txt ���Ϸ� ����� ������.
//		// a.txt �� �����͸� �Է�
//		// > �׵����͸� b.txt���Ϸ� ���
//		File oriFile = new File("A.txt");
//		File copyFile = new File("B.txt");
//		File asd = new File("C.txt");
//		try(FileInputStream fis = new FileInputStream("A.txt");
//			FileOutputStream fos = new FileOutputStream("B.txt");){
//			int fileByte = 0; 
//            // fis.read()�� -1 �̸� ������ �� ������
//           while((fileByte = fis.read()) != -1) {
//                fos.write(fileByte);
//            }
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	public static void main(String[] args) {
		copyFile("A.txt", "B.txt");
	}
	public static void copyFile(String from, String to) { //�޼ҵ�
		try (FileReader fr = new FileReader(from);// �ѱ��ھ� ����
				BufferedReader br = new BufferedReader(fr); // ���پ� ����
				FileWriter fw = new FileWriter(to);) {
			String line = "";
			while ((line = br.readLine()) != null) {
				fw.write(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
