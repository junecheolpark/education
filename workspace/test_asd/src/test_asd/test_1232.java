package test_asd;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;


public class test_1232 {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�١� ��ũ �ڽ� �١�");
			System.out.println("�÷����ϰ� ���� ������ �������ּ���.");
			System.out.println("1. as");
			System.out.println("2. H.O.T.-10-ĵ��");
			System.out.println("3. ������-03-Blueming");
			System.out.println("4. ���α׷�����");
			System.out.print("���Ǽ��� >>");
			int input = Integer.parseInt(sc.nextLine());

			try {
				
				FileInputStream fis = null;
				if (input == 1) {
					fis = new FileInputStream("D:\\���\\workspace\\test_asd\\src\\test_asd\\as.mp3");
					System.out.println();
				} else if (input == 2) {
					fis = new FileInputStream("D:\\���\\workspace\\test_asd\\src\\test_asd\\H.O.T.-10-ĵ�� (Candy)-SM Best Album 2-128.mp3");
					System.out.println();
				} else if (input == 3) {
					fis = new FileInputStream("D:\\���\\workspace\\test_asd\\src\\test_asd\\������-03-Blueming-Love poem-192.mp3");
					System.out.println();
				} else if (input == 4) {
					System.out.println("��ũ�ڽ��� �����մϴ� goodbye>3<");
				}
				Player playMP3 = new Player(fis);
				playMP3.play();
				
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("������ ����ϴµ� �����߽��ϴ�.");
				
			}
			
			
			}
			
			
			
		}



