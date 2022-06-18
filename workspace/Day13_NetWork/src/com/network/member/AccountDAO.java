package com.network.member;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//������ ���� �����, ��� Ŭ����
public class AccountDAO {
	private ArrayList<AccountDTO> list = new ArrayList<>();

	public AccountDAO() {
		list.add(new AccountDTO("abc123","a5555"));
		list.add(new AccountDTO("eee555","a5555"));
	}
	public void join(AccountDTO std) {
		list.add(std);
	}
	
	public boolean checkLogin(String id, String pw){
		// list�� 0�� �ε������� for���� ���鼭
		// �� �ε����� ����ִ� AccountDTO�� �ν��Ͻ���
		// . ��� getId() / getPw() �޼��带 �Ἥ ������
		// �����Ϳ� Ŭ���̾�Ʈ�� �Ѱ��� �Ű����� id, pw �� ��
		for(AccountDTO dto : list) {
			if(dto.getId().equals(id)&& dto.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
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
