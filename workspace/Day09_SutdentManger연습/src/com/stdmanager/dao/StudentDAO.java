package com.stdmanager.dao;

import java.sql.Statement;

import com.stdmanager.dto.StudentDTO;

public class StudentDAO {
	private StudentDTO[] stdList = new StudentDTO[10];
	private int count = 0;
	
	public void insert(StudentDTO std) {
		stdList[count++] = std;
	}
//	public StudentDTO[] selectAll() {
//		return stdList;
//	}
	public void selectAll() {
		for (int i = 0; i < stdList.length; i++) {
			if (stdList[i] != null) {
				System.out.println(stdList[i]);
			}
		}
	}
	public void modify(StudentDTO std) {
		for (int i = 0; i < stdList.length; i++) {
			if (stdList[i] != null && stdList[i].getNum() == std.getNum()) {
				stdList[i].setName(std.getName());
				stdList[i].setAge(std.getAge());
				stdList[i].setGender(std.getGender());
			}
		}
	}
	
	public void delete(int num) {
		for(int i = 0; i < stdList.length; i++) {
			if(stdList[i] != null) {
				if(stdList[i].getNum() == num) {
					stdList[i] = null;
					break;
				}
			}
		}
	}
	
	
	
}
	










