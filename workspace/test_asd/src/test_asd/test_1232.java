package test_asd;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;


public class test_1232 {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("☆☆ 쥬크 박스 ☆☆");
			System.out.println("플레이하고 싶은 음악을 선택해주세요.");
			System.out.println("1. as");
			System.out.println("2. H.O.T.-10-캔디");
			System.out.println("3. 아이유-03-Blueming");
			System.out.println("4. 프로그램종료");
			System.out.print("음악선택 >>");
			int input = Integer.parseInt(sc.nextLine());

			try {
				
				FileInputStream fis = null;
				if (input == 1) {
					fis = new FileInputStream("D:\\백업\\workspace\\test_asd\\src\\test_asd\\as.mp3");
					System.out.println();
				} else if (input == 2) {
					fis = new FileInputStream("D:\\백업\\workspace\\test_asd\\src\\test_asd\\H.O.T.-10-캔디 (Candy)-SM Best Album 2-128.mp3");
					System.out.println();
				} else if (input == 3) {
					fis = new FileInputStream("D:\\백업\\workspace\\test_asd\\src\\test_asd\\아이유-03-Blueming-Love poem-192.mp3");
					System.out.println();
				} else if (input == 4) {
					System.out.println("쥬크박스를 종료합니다 goodbye>3<");
				}
				Player playMP3 = new Player(fis);
				playMP3.play();
				
				fis.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("음악을 재생하는데 실패했습니다.");
				
			}
			
			
			}
			
			
			
		}



