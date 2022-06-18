package com.fileio.quiz;

import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz01_FileRead {
	// 구글에서 원하는 짧은영어로 된 시,가사,뉴스,소설 하나를 구해서 프로젝트 폴더내에
	// txt파일로 저장> 그파일을 읽어들여 콘솔로 출력하기
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
