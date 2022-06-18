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
			
			String hi = "�����Ͻ� �� ȯ���մϴ�.";
			dos.writeUTF(hi);
			dos.flush();
			
			try{
				while(true) {
					String menu = dis.readUTF();
					System.out.println(menu);
					String rs = "";
					if(menu.equals("1")) {
						rs ="1995���, ��ü�� ���ϳ� ������ ��� õõ�� �̷����ڴ�.";
					}else if(menu.equals("2")) {
						rs ="12��C��F\r\n"
								+ "����Ȯ��: 0%\r\n"
								+ "����: 68%\r\n"
								+ "ǳ��: 4m/s";
					}else if(menu.equals("3")) {
						rs ="������ �ζǹ�ȣ\n" + getLotto();
					}
					dos.writeUTF(rs);
					dos.flush();
				}
		}catch(Exception e){
			System.out.println("������ ������ϼ���.");
			e.printStackTrace();
		}
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static HashSet<Integer> getLotto(){
		// 1~45 ������ 6���� ������ ��ȣ �̾Ƴ��� ��ȯ���ֱ�
		// (Math.random() * (�ִ밪 - �ּҰ� + 1)+ �ּҰ�)
		Random rand = new Random();
		// nexmInt(): 0~N �̸��� ������ ���� ��ȯ���ִ� �Լ�
		
		// �÷��� > �ߺ����� �ʴ� ���� �����ϴ� �����
		// + ���� ������� ������� ����
		// HashSet<Integer>lotto = new HashSet<>(); //ArrayList �� ���
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
