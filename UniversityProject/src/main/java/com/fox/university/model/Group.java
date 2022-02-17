package com.fox.university.model;

import java.util.List;

public class Group {

	private int id;
	private String name;
	private Cathedra cathedra;
	private List<Student> students;

	public Group() {
	}

	public Group(int id, String name, Cathedra cathedra, List<Student> students) {
		this.id = id;
		this.name = name;
		this.cathedra = cathedra;
		this.students = students;
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

	public Cathedra getCathedra() {
		return cathedra;
	}

	public void setCathedra(Cathedra cathedra) {
		this.cathedra = cathedra;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", cathedra=" + cathedra + ", students=" + students + "]";
	}
}
