package com.kh.student;

import java.sql.Date;

public class DTO {
private int no;
private String name;
private String phone;
private String birth;

public DTO() {}

public DTO(int no, String name, String phone, String birth) {
	super();
	this.no = no;
	this.name = name;
	this.phone = phone;
	this.birth = birth;
}

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getBirth() {
	return birth;
}

public void setBirth(String birth) {
	this.birth = birth;
}

@Override
public String toString() {
	return "DTO [no=" + no + ", name=" + name + ", phone=" + phone + ", birth=" + birth + "]";
}







}
