package com.accolite.mini_au.CRUD_Rest.model;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String name, String contact, String email, int age, String gender) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.contact =contact;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	
	private int emp_id;
	private String name;
	private String contact;
	private String email;
	private int age;
	private String gender;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
