package com.test;

public class Person {
	private Long id;
	private String firstname;
	private String lastname;
	private String gender;
	private String whyapply;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWhyapply() {
		return whyapply;
	}
	public void setWhyapply(String whyapply) {
		this.whyapply = whyapply;
	}
}
