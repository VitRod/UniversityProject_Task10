package com.fox.university.menuitem;

import java.time.LocalTime;
import java.util.Scanner;

import com.fox.university.model.Lesson;
import com.fox.university.model.LessonTime;

public class LessonTimeMenu {

	public LocalTime addStartTimeToLesson() {
		Scanner sc = new Scanner(System.in);
		boolean isWrongAnswer;
		LocalTime time = null;

		do {
			isWrongAnswer = false;
			System.out.println("Choose lesson start time from 1 to 4 :");
			int selectTime = sc.nextInt();

			switch (selectTime) {
			case 1:
				System.out.println("Lesson start time :");
				time = LocalTime.parse("09:00");
				System.out.println(time);

				break;
			case 2:
				System.out.println("Lesson start time :");
				time = LocalTime.parse("11:10");
				System.out.println(time);

				break;
			case 3:
				System.out.println("Lesson start time :");
				time = LocalTime.parse("13:30");
				System.out.println(time);

				break;
			case 4:
				System.out.println("Lesson start time :");
				time = LocalTime.parse("15:40");
				System.out.println(time);

				break;

			default:
				System.out.println("Choose from 1 to 4");
				isWrongAnswer = true;
			}
		} while (isWrongAnswer);
		return time;
	}

	public LocalTime addEndTimeToLesson() {
		Scanner sc = new Scanner(System.in);
		boolean isWrongAnswer;
		LocalTime time = null;

		do {
			isWrongAnswer = false;
			System.out.println("For lesson end time choose the same option as for start time");
			int selectTime = sc.nextInt();

			switch (selectTime) {
			case 1:
				System.out.println("Lesson end time :");
				time = LocalTime.parse("11:00");
				System.out.println(time);

				break;
			case 2:
				System.out.println("Lesson end time :");
				time = LocalTime.parse("13:10");
				System.out.println(time);

				break;
			case 3:
				System.out.println("Lesson end time :");
				time = LocalTime.parse("15:30");
				System.out.println(time);

				break;
			case 4:
				System.out.println("Lesson end time :");
				time = LocalTime.parse("17:40");
				System.out.println(time);

				break;

			default:
				System.out.println("Choose from 1 to 4");
				isWrongAnswer = true;
			}
		} while (isWrongAnswer);
		return time;
	}
}
