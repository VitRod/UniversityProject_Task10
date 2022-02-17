package com.fox.university.model;

public class LectureHall {
	
	private int id;
	private String name;
	private int capacity;
	
	public LectureHall() {
		
	}

	public LectureHall(int id, String name, int capacity) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Lecturehall [id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
	}	
}
