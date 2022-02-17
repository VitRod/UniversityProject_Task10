package com.fox.university.model;

import java.time.LocalDate;
import java.util.List;

public class Lesson {

	private int id;
	private LocalDate date;
	private LessonTime time;
	private LectureHall lectureHall;
	private Subject subject;
	private List<Group> groups;
	private Teacher teacher;

	public Lesson(int id, LocalDate date, LessonTime time, LectureHall lectureHall, Subject subject, List<Group> groups,
			Teacher teacher) {
		this.id = id;
		this.date = date;
		this.time = time;
		this.lectureHall = lectureHall;
		this.subject = subject;
		this.groups = groups;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LessonTime getTime() {
		return time;
	}

	public void setTime(LessonTime time) {
		this.time = time;
	}

	public LectureHall getLectureHall() {
		return lectureHall;
	}

	public void setLectureHall(LectureHall lectureHall) {
		this.lectureHall = lectureHall;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Lesson [id=" + id + ", date=" + date + ", time=" + time + ", lecturehall=" + lectureHall + ", subject="
				+ subject + ", groups=" + groups + ", teacher=" + teacher + "]";
	}
}
