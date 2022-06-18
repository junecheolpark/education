package com.fileio.exam;

import java.io.FileInputStream;

public class Exam02_FileRead01 {
	public static void main(String[] args) {
		//try~with~resource
		//try(객체 자동반납을 해주고 싶은 생성문)
		try( FileInputStream fis = new  FileInputStream("test.txt")){
			//아스키코드
//			System.out.println(fis.read()); //하나씩불러옴
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			//데이터 한번에 읽어오기
			byte[] fileContents = new byte[100];
			fis.read(fileContents);
			// test.txt 파일로부터 읽어들여온 데이터를 fileContents 배열안에 모두 담음
			
			for(byte b : fileContents) {
				System.out.println(b + " ");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
// 파일입력 > Stream> InputStream
		FileInputStream fis = null;
		try {
			// 파일과 관련된 객체 인스턴스를 만들었을 때에는 객체 반납을 마지막에 해줘야함
			fis = new FileInputStream("test.txt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//만약 try 문안쪽에서 예외가 발생하더라도 finally 안쪽 코드는 무조건 실행된
			try{
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
