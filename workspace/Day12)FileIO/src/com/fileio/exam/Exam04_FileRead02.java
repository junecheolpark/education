package com.fileio.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exam04_FileRead02 {
	public static void main(String[] args) {
		// FileReader : text file character 단위로 읽어오는 클래스
	// BufferrdReader : 데이터를 한줄 단위로 읽어 들여올수 있게 해줌
		try(FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);){
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read());
//			System.out.println((char)fr.read()); //한 문자씩 불러옴
			
//			System.out.println(br.readLine()); //한줄씩 불러옴
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
