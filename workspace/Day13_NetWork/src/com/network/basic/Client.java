package com.network.basic;

import java.net.Socket;

public class Client {
	public static void main(String[] args) {

		// Ŭ���̾�Ʈ�� ���� ������ �ΰ��� ���ڰ� �ʿ�
		// 1. ������ ip �ּ�
		// 2. �������� ������ ��Ʈ��ȣ
		// ������ ip �ּ� > localhost ��� �ᵵ ��
		try(Socket client = new Socket("192.168.200.176", 8000);){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
