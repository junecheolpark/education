package DAO;

import java.util.ArrayList;

import DTO.Basic;
import DTO.Member;
import DTO.Premium;
import DTO.Standard;

public class MemberDAO {
	private ArrayList<Member> list = new ArrayList<>();

	public void insert(Member dto) {// 1번
		list.add(dto);
	}

	public void insertsample() {
		list.add(new Basic("aaa555", "AAA", "210505", 3000));
		list.add(new Standard("eee666", "E5E5", "211220", 5000));
		list.add(new Premium("cdd333", "C6C6", "220605", 2000));
	}

	public void Output() { // 2번 출력
		System.out.println("ID\t등급\t닉네임\t가입일\t포인트");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public Member selectByNickname(String nickname) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNickname().equals(nickname)) {
				return list.get(i);
			}
		}
		return null;
	}

	public Member selectById(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return list.get(i);
			}
		}
		return null;
	}

	public int modify(String id, String nickname, int point) {
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getId().equals(id)) {
				list.get(j).setNickname(nickname);
				list.get(j).setPoint(point);
				return 1;
			}
		}
		return -1;
	}

	public int delete(String id) {
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getId().equals(id)) {
				list.remove(j);
				return 1;
			}
		}
		return -1;
	}
	

}
