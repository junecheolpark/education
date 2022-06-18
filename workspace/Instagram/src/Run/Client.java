package Run;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.AccountDAO;
import DAO.FeedDAO;
import DTO.AccountDTO;


public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDAO acdao = new AccountDAO();
		FeedDAO fdao = new FeedDAO();
		
		while(true) {
			System.out.print("==== �޴� ���� ====\r\n" + "1. �α���\r\n" + "2. ȸ������\r\n" + "0. ���α׷� ����\r\n" + ">> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {//�α���
				String id = "abc";
				String pw = "abc";
				String nickname = "abc";
				AccountDTO dto = new AccountDTO(id, pw, nickname);
				acdao.insert(dto);
//				acdao.insertsample();
			}else if(menu == 2) {//ȸ������
				while(true) {
					System.out.print("==== ȸ������ ====\nID : ");
					String id = sc.nextLine();
					int rs = acdao.samePw(id);
					if(rs == 1) {
						System.out.println("�̹� ������� ���̵��Դϴ�");
					}
					System.out.print("PW : ");
					String pw = sc.nextLine();
					int rs1 = acdao.samePw(id);
					if(rs1 == 1) {
						System.out.println("�̹� ������� ��й�ȣ�Դϴ�");
					}
					System.out.print("NICKNAME : ");
					String nickname = sc.nextLine();
					int rs2 = acdao.samePw(id);
					if(rs2 == 1) {
						System.out.println("�̹� ������� �г����Դϴ�");
					}
					
					
					acdao.insert(new AccountDTO(id, pw, nickname));
					
				}
				
			}else if(menu == 3) {//���α׷�����
				System.out.println(acdao.selctAll().toString()); 
				
			}
				
			}
		
		
	}

	
}