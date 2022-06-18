package com.stdmanager.dao;

import java.util.ArrayList;

import com.stdmanager.dto.StudentDTO;

public class StudentDAO {
	private ArrayList stdList = new ArrayList<>();

	public void insert(StudentDTO std) {
		stdList.add(std);
	}

	public ArrayList selectAll() {
		return stdList;
	}

	public void modify(StudentDTO std) {
		for (int i = 0; i < stdList.size(); i++) {

			if (((StudentDTO)stdList.get(i)).getNo() == std.getNo()) {
				stdList.set(i, std);//새로운 StudentDTO 형 인스턴스로 기존 배열에서 갈아끼우는 작업
//					or
//				((StudentDTO)stdList.get(i)).setName(std.getName());
//				((StudentDTO)stdList.get(i)).setAge(std.getAge());
//				((StudentDTO)stdList.get(i)).setGender(std.getGender());
				break;
			}

		}
	}

	public void delete(int no) {
		for (int i = 0; i < stdList.size(); i++) {
			if (((StudentDTO)stdList.get(i)).getNo() == no) {
				stdList.remove(i);
				break;
			}

		}
	}

	public boolean doesNoExist(int no) {
		for (int i = 0; i < stdList.size(); i++) {
				if (((StudentDTO)stdList.get(i)).getNo() == no) {
					return true;
				}
		}
		return false;
	}

}
