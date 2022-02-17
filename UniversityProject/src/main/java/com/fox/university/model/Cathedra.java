package com.fox.university.model;

import java.util.List;

public class Cathedra {
	
	private int id;
	private String name;
	private List<Group> groups;
	private List<Teacher> teachers;
	
	public Cathedra() {
		
	}
	
	public Cathedra(int id, String name, List<Group> groups, List<Teacher> teachers) {
		this.id = id;
		this.name = name;
		this.groups = groups;
		this.teachers = teachers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Cathedra [id=" + id + ", name=" + name + ", groups=" + groups + ", teachers=" + teachers + "]";
	}
}
