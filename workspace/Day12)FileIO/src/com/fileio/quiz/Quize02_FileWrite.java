package com.fileio.quiz;

import java.io.FileWriter;

public class Quize02_FileWrite {
	//str에 담긴 데이터를 newText.txt 파일에 저장해보세요.
//	public static void main(String[] args) {
//		String str = "Think of me \r\n"
//				+ "\r\n"
//				+ "Think of me fondly\r\n"
//				+ "\r\n"
//				+ "When we've said goodbye\r\n"
//				+ "\r\n"
//				+ "Remember me\r\n"
//				+ "\r\n"
//				+ "Once in a while\r\n"
//				+ "\r\n"
//				+ "Please promise me you'll try";
//				
//				
//		try(FileOutputStream fos = new FileOutputStream("newTetx.txt", true)){
//			// 문자열 => 문자로 변환
//			byte[] strByte = new byte[str.length()];
//			fos.write(strByte);
//		}catch(Exception e) {
//			e.printStackTrace();
//			
//		}
//	}
public static void main(String[] args) {//exam05를이용한수정
	String str = "Think of me \r\n"
			+ "\r\n"
			+ "Think of me fondly\r\n"
			+ "\r\n"
			+ "When we've said goodbye\r\n"
			+ "\r\n"
			+ "Remember me\r\n"
			+ "\r\n"
			+ "Once in a while\r\n"
			+ "\r\n"
			+ "Please promise me you'll try";
	try(FileWriter fw = new FileWriter("newTetx.txt");){
		fw.write(str);
		fw.flush();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
