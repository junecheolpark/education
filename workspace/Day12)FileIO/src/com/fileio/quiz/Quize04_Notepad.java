package com.fileio.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Quize04_Notepad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList<>();
		while(true) {
			System.out.println("***콘솔 메모장***");
			System.out.println("1. 메모하기");
			System.out.println("2. 메모장보기");
			System.out.println("3. 메모장 수정하기");
			System.out.print("4. 프로그램 종료 \n>> ");
			int no = Integer.parseInt(sc.nextLine());
			if(no == 1) {
				System.out.print("메모 입력 \n>> ");
				String write = sc.nextLine();
				
				System.out.print("저장할 파일의 이름을 입력하세요. \n>> ");
				String txt = sc.nextLine();
				File file = new File(txt);
				
				making(txt);//새로운 파일 만드는 메소드
				overwrite(write, txt); // 메모를 파일에 입력해주는 메소드
				list.add(txt); //arrayList 배열에 저장
		//========================================================		
			}else if(no == 2) {
				System.out.println("=====저장된 메모 목록=====");
//				System.out.println(list.toString());
				for (int i = 0; i<list.size();i++) {
					System.out.println(i+1 +". " + list.get(i));
				}
				
				System.out.print("열어볼 파일의 이름을 입력하세요. \n>> ");
				String txt = sc.nextLine(); 
				reading(txt);// 메모장 내용 콘솔창에 표시
		//========================================================		
			}else if(no == 3) {// 메모장 내용 수정하기
				System.out.println("=====저장된 메모 목록=====");
				for (int i = 0; i<list.size();i++) {
					System.out.println(i+1 +". " + list.get(i));
				}
				
				System.out.print("수정할 파일의 이름을 입력하세요. \n>> ");
				String txt = sc.nextLine();
	
				System.out.print("수정 방식을 선택하세요.\r\n"
						+ "1. 덮어쓰기\r\n"
						+ "2. 이어쓰기\r\n"
						+ ">> ");
				
				int input = Integer.parseInt(sc.nextLine());
				if(input == 1) {//덮어쓰기
					System.out.print("수정할 내용을 입력하세요 \n>> ");
					String write = sc.nextLine();
					overwrite(write, txt);
					
				}else if(input == 2) {//이어쓰기
					System.out.print("수정할 내용을 입력하세요 \n>> ");
					String write = sc.nextLine();
					subwrite(write, txt);
				}
				System.out.println("수정 완료");
		//========================================================		
			}else if(no == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public static void making(String name) {
		File file = new File(name);
		if(!file.exists()) {//새로운 메모장 만들기
			try {
				file.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void overwrite(String write, String fileName) {
		try(FileWriter fw = new FileWriter(fileName);){
			//메모장에데이터 저장
			fw.write(write);
			fw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void subwrite(String write, String fileName) {
		try(FileWriter fw = new FileWriter(fileName, true);){
			//메모장에데이터 저장
			fw.write(write);
			fw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void reading(String fileName) {
		try(FileReader fr = new FileReader(fileName);// 열어볼 메모장 출력
				BufferedReader br = new BufferedReader(fr);){
				String line = "";
				while((line = br.readLine()) != null) {
					System.out.println(line + "\n");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	
	
	
	
}
