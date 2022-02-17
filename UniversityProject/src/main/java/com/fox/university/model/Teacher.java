package com.fox.university.model;

import java.util.List;

public class Teacher {
	
	private int id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Degree degree;
	private List<Subject> subjects;
	private Cathedra cathedra;
	private String phone;
	private String email;
	private Address address;
	
	public Teacher() {
		
	}
	
	public Teacher(int id, String firstName, String lastName, Gender gender, Degree degree,
			List<Subject> subjects, Cathedra cathedra, String phone, String email, Address address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.degree = degree;
		this.subjects = subjects;
		this.cathedra = cathedra;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public Cathedra getCathedra() {
		return cathedra;
	}
	public void setCathedra(Cathedra cathedra) {
		this.cathedra = cathedra;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", degree=" + degree + ", subjects=" + subjects + ", cathedra=" + cathedra + ", phone="
				+ phone + ", email=" + email + ", address=" + address + "]";
	}
}
