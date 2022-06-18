package com.fileio.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Quize03_Copyfile {
//	public static void main(String[] args) {
////A.txt 파일을 복사해서 B.txt 파일로 만들어 보세요.
//		// a.txt 의 데이터를 입력
//		// > 그데이터를 b.txt파일로 출력
//		File oriFile = new File("A.txt");
//		File copyFile = new File("B.txt");
//		File asd = new File("C.txt");
//		try(FileInputStream fis = new FileInputStream("A.txt");
//			FileOutputStream fos = new FileOutputStream("B.txt");){
//			int fileByte = 0; 
//            // fis.read()가 -1 이면 파일을 다 읽은것
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
	public static void copyFile(String from, String to) { //메소드
		try (FileReader fr = new FileReader(from);// 한글자씩 읽음
				BufferedReader br = new BufferedReader(fr); // 한줄씩 저장
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
