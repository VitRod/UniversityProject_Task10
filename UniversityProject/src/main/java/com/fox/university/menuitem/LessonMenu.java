package com.fox.university.menuitem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fox.university.model.Group;
import com.fox.university.model.LectureHall;
import com.fox.university.model.Lesson;
import com.fox.university.model.LessonTime;
import com.fox.university.model.Subject;
import com.fox.university.model.Teacher;

public class LessonMenu {

	ArrayList<Lesson> lessons = new ArrayList<>();

	public void addLesson(Scanner input) {
		int lessonId = lessons.size() + 1;
		System.out.println("Enter lesson date in format 2022-01-01:");
		LocalDate date = LocalDate.parse(input.next());

		System.out.println("Choose lesson time :");
		LessonTimeMenu timeMenu = new LessonTimeMenu();
		LocalTime startLocalTime = timeMenu.addStartTimeToLesson();
		LocalTime endLocalTime = timeMenu.addEndTimeToLesson();

		LessonTime lessonTime = new LessonTime();
		lessonTime.setStartTime(startLocalTime);
		lessonTime.setEndTime(endLocalTime);

		System.out.println("Lecturehall :");
		LectureHall lectureHall = new LectureHall();
		System.out.println("Lecturehall Name:");
		lectureHall.setName(input.next());
		System.out.println("Lecturehall Capacity:");
		lectureHall.setCapacity(input.nextInt());

		System.out.println("Subject :");
		Subject subject = new Subject();
		System.out.println("Subject id :");
		subject.setId(input.nextInt());
		System.out.println("Subject name :");
		subject.setName(input.next());
		System.out.println("Subject description :");
		subject.setDescription(input.nextLine());

		System.out.println("Group :");
		List<Group> groups = new ArrayList<Group>();

		Group group1 = new Group();
		System.out.println("Group id for 1st group :");
		group1.setId(input.nextInt());
		System.out.println("Group name for 1st group :");
		group1.setName(input.next());

		Group group2 = new Group();
		System.out.println("Group id for 2nd group :");
		group2.setId(input.nextInt());
		System.out.println("Group name for 2nd group :");
		group2.setName(input.next());

		Group group3 = new Group();
		System.out.println("Group id for 3rd group :");
		group3.setId(input.nextInt());
		System.out.println("Group name for 3rd group :");
		group3.setName(input.next());

		groups.add(group1);
		groups.add(group2);
		groups.add(group3);

		System.out.println("Teacher :");
		Teacher teacher = new Teacher();
		System.out.println("Teacher's first name :");
		teacher.setFirstName(input.next());
		System.out.println("Teacher's last name :");
		teacher.setLastName(input.next());

		Lesson lesson = new Lesson(lessonId, date, lessonTime, lectureHall, subject, groups, teacher);

		lesson.setId(lessonId);
		lesson.setDate(date);
		lesson.setTime(lessonTime);
		lesson.setLectureHall(lectureHall);
		lesson.setSubject(subject);
		lesson.setGroups(groups);
		lesson.setTeacher(teacher);
		lessons.add(lesson);

		System.out.println("Successfully added !");
	}

	public void readAllLessons() {
		if (lessons.size() == 0) {
			System.out.println("there are no students");
		} else {
			for (int i = 0; i < lessons.size(); i++) {
				System.out.println(lessons.get(i));
			}
		}
	}
}
