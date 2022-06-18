package com.stdmanager.dao;

import com.stdmanager.dto.StudentDTO;

public class StudentDAO {
	private StudentDTO[] stdList = new StudentDTO[10];
	private int index = 0;
	
	public void insert(StudentDTO std){
		stdList[index++] = std;
	}
	
	public StudentDTO[] selectAll(){
		return stdList;
	}
	
	public void modify(StudentDTO std) {
		for(int i = 0; i < stdList.length; i++) {
			if(stdList[i] != null) {
				if(stdList[i].getNo() == std.getNo()) {
					stdList[i].setName(std.getName());
					stdList[i].setAge(std.getAge());
					stdList[i].setGender(std.getGender());
					break;
				}
			}
		}
	}
	
	public void delete(int no) {
		for(int i = 0; i < stdList.length; i++) {
			if(stdList[i] != null) {
				if(stdList[i].getNo() == no) {
					stdList[i] = null;
					break;
				}
			}
		}
	}
	
	public boolean doesNoExist(int no) {
		for(int i = 0; i < stdList.length; i++) {
			if(stdList[i] != null) {
				if(stdList[i].getNo() == no) {
					return true;
				}
			}
		}
		return false;
	}

}










