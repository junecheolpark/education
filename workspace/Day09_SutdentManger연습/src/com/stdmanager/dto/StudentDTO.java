package com.stdmanager.dto;

public class StudentDTO {
	private int num;
	private String name;
	private int age;
	private char gender;
	
	public StudentDTO() {}
	public StudentDTO(int num, String name, int age, char gender) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentDTO [num=" + num + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
