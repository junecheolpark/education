package com.network.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class Server {
	public static void main(String[] args) {
		
		try(ServerSocket server = new ServerSocket(8000);
				Socket sock = server.accept();
				DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
				DataInputStream dis = new DataInputStream(sock.getInputStream());){
			
			String hi = "접속하신 걸 환영합니다.";
			dos.writeUTF(hi);
			dos.flush();
			
			try{
				while(true) {
					String menu = dis.readUTF();
					System.out.println(menu);
					String rs = "";
					if(menu.equals("1")) {
						rs ="1995년생, 대체로 길하나 여성의 경우 천천히 이뤄지겠다.";
					}else if(menu.equals("2")) {
						rs ="12°C°F\r\n"
								+ "강수확률: 0%\r\n"
								+ "습도: 68%\r\n"
								+ "풍속: 4m/s";
					}else if(menu.equals("3")) {
						rs ="오늘의 로또번호\n" + getLotto();
					}
					dos.writeUTF(rs);
					dos.flush();
				}
		}catch(Exception e){
			System.out.println("서버를 재부팅하세요.");
			e.printStackTrace();
		}
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static HashSet<Integer> getLotto(){
		// 1~45 사이의 6개의 랜덤한 번호 뽑아내서 반환해주기
		// (Math.random() * (최대값 - 최소값 + 1)+ 최소값)
		Random rand = new Random();
		// nexmInt(): 0~N 미만의 랜덤한 수를 반환해주는 함수
		
		// 컬렉션 > 중복되지 않는 값만 저장하는 저장소
		// + 값이 순서대로 저장되지 않음
		// HashSet<Integer>lotto = new HashSet<>(); //ArrayList 와 비슷
		HashSet<Integer>lotto = new HashSet<>();
//		for(int i = 0; i < 6; i++) {
//			lotto.add(rand.nextInt(45)+1);
//		}
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45)+1);
		}
		return lotto;
		
	}
	
}
