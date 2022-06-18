package com.network.member;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//계정에 대한 저장소, 기능 클래스
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
		// list의 0번 인덱스부터 for문을 돌면서
		// 각 인덱스에 들어있는 AccountDTO형 인스턴스에
		// . 찍고 getId() / getPw() 메서드를 써서 가져온
		// 데이터와 클라이언트가 넘겨준 매개변수 id, pw 를 비교
		for(AccountDTO dto : list) {
			if(dto.getId().equals(id)&& dto.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
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
