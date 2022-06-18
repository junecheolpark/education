package com.fileio.exam;

import java.io.FileWriter;

public class Exam05_FileWrite02 {
	public static void main(String[] args) {
		String str = "단 한 사람의 가슴도\r\n"
				+ "제대로 지피지 못했으면서도\r\n"
				+ "무성한 연기만 내고 있는\r\n"
				+ "내 마음의 군불이여\r\n"
				+ "꺼지려면 아직 멀었느냐";
		try(FileWriter fw = new FileWriter("newKorean.txt")){
			
			fw.write(str);
			fw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
