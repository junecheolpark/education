package Run;

import java.util.Scanner;

import DTO.AccountDTO;

public class Server {
	public static void main(String[] args) {
		AccountDTO[] actList = new AccountDTO[110];
		Scanner sc = new Scanner(System.in);
		AccountDTO dto = new AccountDTO("abc", "abc", "ABC���ݸ�");
		int count = 0;
		actList[count++] = dto;
		System.out.println("�����ϽŰ� ȯ���մϴ�.");
		while(true) {
			System.out.println("==== �޴� ���� ====\r\n"
					+ "1. �α���\r\n"
					+ "2. ȸ������\r\n"
					+ "3. ���α׷� ����");
			int menu = Integer.parseInt(sc.nextLine());
			System.out.print(">> ");
			if (menu == 1) {//�α���
				System.out.print("===�α���==="
						+ "\nID :");
				String id =sc.nextLine();
				System.out.print("PW :");
				String pw =sc.nextLine();
				for(int i = 0; i< actList.length; i++) {//�ߺ��� �˻� 
					if(actList[i].getId() != id 
							&& actList[i].getPw() != pw) {
						System.out.println("���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�."); 
					} else if(actList[i].getId().equals(id) 
							&& actList[i].getPw().equals(pw)) {
						System.out.println("�α��� ����!");
						System.out.println(actList[i].getNickname() + "�� �������.");
					}
				}
				
			}else if (menu == 2) {//ȸ������
				
				vending: while(true) {
					System.out.print("===ȸ������==="
							+ "\nID :");
					String id =sc.nextLine();
					for(int i = 0; i< actList.length; i++) {//�ߺ��� �˻� ���̵�
						if(actList[i].getId().equals(id)) {
							System.out.println("�ߺ��� ID�Դϴ�"); 
							continue vending;
						} break;
					}
					System.out.print("PW :");
					String pw =sc.nextLine();
					for(int i = 0; i< actList.length; i++) {//�ߺ��� �˻� 
						if(actList[i].getPw().equals(pw)) {
							System.out.println("�ߺ��� PW�Դϴ�"); 
							continue vending;
						} break;
					}
					
					System.out.print("Nickname :");
					String nickname =sc.nextLine();
					for(int i = 0; i< actList.length; i++) {//�ߺ��� �˻� 
						if(actList[i].getNickname().equals(nickname)) {
							System.out.println("�ߺ��� �г��Դϴ�"); 
						}else {
							AccountDTO act = new AccountDTO(id, pw, nickname);
							actList[count++] = act;
							break vending;
						}
					}
				}
				
			}else if (menu == 3) {//��ȸ
				for (int i=0; 0<actList.length; i++) {
					if(actList[i]!=null) {
						System.out.println(actList[i]);
					}
				}
			}
		}
		
		
	}



}