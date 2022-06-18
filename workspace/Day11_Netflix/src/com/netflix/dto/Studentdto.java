package com.netflix.dto;

public class Studentdto {
	
private Member[] member;

public Studentdto() {}
public Studentdto(Member[] member) {
	super();
	this.member = member;
}

public Member[] getMember() {
	return member;
}

public void setMember(Member[] member) {
	this.member = member;
}
}
