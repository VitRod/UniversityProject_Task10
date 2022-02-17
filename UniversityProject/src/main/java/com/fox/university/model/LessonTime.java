package com.fox.university.model;

import java.time.LocalTime;

public class LessonTime {

	private int id;
	private LocalTime startTime;
	private LocalTime endTime;

	public LessonTime() {

	}

	public LessonTime(int id, LocalTime startTime, LocalTime endTime) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "LessonTime [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
}
