package com.fox.university.model;

import java.time.LocalDate;

public class Vacation {
	
	private int id;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Vacation(int id, LocalDate startDate, LocalDate endDate) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Vacation [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
