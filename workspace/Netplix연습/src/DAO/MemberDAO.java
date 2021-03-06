package DAO;

import java.util.ArrayList;

import DTO.Basic;
import DTO.Membership;
import DTO.Premium;
import DTO.Stand;

public class MemberDAO {
	private ArrayList<Membership> list = new ArrayList<>();
	
	public void insertSample() {//임시
		list.add(new Basic("aaa555","AAA", "210505", 3000));
		list.add(new Stand("eee666","E5E5", "211220", 5000));
		list.add(new Premium("cdd333","C6C6", "220605", 2000));
	}
	public void insert(Membership dto) { //1번 등록
		list.add(dto);
	}
	public ArrayList selctAll() { //2번 출력
		return list;
	}
	public Membership selectById(String id) { //3번출력
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				return list.get(i);
			}
		} return null;
	}
	public Membership selectByNickName(String nickname) {//3번출력
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNickname().equals(nickname)) {
				return list.get(i);
			}
		} return null;
	}
	
	public int modify(String id, String nickname, int point){
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				// 수정할 회원의 정보 -> list.get(i)
				list.get(i).setNickname(nickname);
				list.get(i).setPoint(point);
				return 1;
			}
		}return -1;
	}
	public int delete(String id){
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				// 수정할 회원의 정보 -> list.get(i)
				list.remove(i);
				return 1;
			}
		}return -1;
	}
	
	
	
}
    