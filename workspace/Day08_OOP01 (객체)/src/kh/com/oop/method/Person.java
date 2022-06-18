package kh.com.oop.method;

public class Person {
private int id = 0;
private String name = null;
private String contact = null;

public Person() {}


public Person(int id, String name, String contact) {
	this.id = id;
	this.name = name;
	this.contact = contact;
}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}//
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}//
	
	public void printAll(int id, String name, String contact) {
		System.out.println("고유번호는 " + getId() + ", 이름은 " + getName() + ", 연락처는 " + getContact());
	}



		
	}
	


