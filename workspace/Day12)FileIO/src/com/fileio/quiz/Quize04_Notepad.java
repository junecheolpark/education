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
			System.out.println("***�ܼ� �޸���***");
			System.out.println("1. �޸��ϱ�");
			System.out.println("2. �޸��庸��");
			System.out.println("3. �޸��� �����ϱ�");
			System.out.print("4. ���α׷� ���� \n>> ");
			int no = Integer.parseInt(sc.nextLine());
			if(no == 1) {
				System.out.print("�޸� �Է� \n>> ");
				String write = sc.nextLine();
				
				System.out.print("������ ������ �̸��� �Է��ϼ���. \n>> ");
				String txt = sc.nextLine();
				File file = new File(txt);
				
				making(txt);//���ο� ���� ����� �޼ҵ�
				overwrite(write, txt); // �޸� ���Ͽ� �Է����ִ� �޼ҵ�
				list.add(txt); //arrayList �迭�� ����
		//========================================================		
			}else if(no == 2) {
				System.out.println("=====����� �޸� ���=====");
//				System.out.println(list.toString());
				for (int i = 0; i<list.size();i++) {
					System.out.println(i+1 +". " + list.get(i));
				}
				
				System.out.print("��� ������ �̸��� �Է��ϼ���. \n>> ");
				String txt = sc.nextLine(); 
				reading(txt);// �޸��� ���� �ܼ�â�� ǥ��
		//========================================================		
			}else if(no == 3) {// �޸��� ���� �����ϱ�
				System.out.println("=====����� �޸� ���=====");
				for (int i = 0; i<list.size();i++) {
					System.out.println(i+1 +". " + list.get(i));
				}
				
				System.out.print("������ ������ �̸��� �Է��ϼ���. \n>> ");
				String txt = sc.nextLine();
	
				System.out.print("���� ����� �����ϼ���.\r\n"
						+ "1. �����\r\n"
						+ "2. �̾��\r\n"
						+ ">> ");
				
				int input = Integer.parseInt(sc.nextLine());
				if(input == 1) {//�����
					System.out.print("������ ������ �Է��ϼ��� \n>> ");
					String write = sc.nextLine();
					overwrite(write, txt);
					
				}else if(input == 2) {//�̾��
					System.out.print("������ ������ �Է��ϼ��� \n>> ");
					String write = sc.nextLine();
					subwrite(write, txt);
				}
				System.out.println("���� �Ϸ�");
		//========================================================		
			}else if(no == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
	
	public static void making(String name) {
		File file = new File(name);
		if(!file.exists()) {//���ο� �޸��� �����
			try {
				file.createNewFile();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void overwrite(String write, String fileName) {
		try(FileWriter fw = new FileWriter(fileName);){
			//�޸��忡������ ����
			fw.write(write);
			fw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void subwrite(String write, String fileName) {
		try(FileWriter fw = new FileWriter(fileName, true);){
			//�޸��忡������ ����
			fw.write(write);
			fw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void reading(String fileName) {
		try(FileReader fr = new FileReader(fileName);// ��� �޸��� ���
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
