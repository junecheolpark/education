package DAO;

import java.util.ArrayList;

import DTO.AccountDTO;
import DTO.FeedDTO;

public class AccountDAO {
	private ArrayList<AccountDTO> list = new ArrayList<>();
	
	public void insert(AccountDTO dto) {
		list.add(dto);
	}
	public ArrayList selctAll() { //2번 출력
		return list;
	}
	public void insertsample() {
		list.add(new AccountDTO("abc", "abc", "ABC초콜릿"));
	}
	/**/
	public void Output() {
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i)); 
		}
	}
	/**/
	public int sameId(String id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)){
				return 1;
			}
		}return -1;
	}
	public int samePw(String pw) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getPw().equals(pw)) {
				return 1;
			}
		}return -1;
	}
	public int sameNickname(String nickname) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getNickname().equals(nickname)) {
				return 3;
			}
		}return -1;
	}

	
	
	
}
