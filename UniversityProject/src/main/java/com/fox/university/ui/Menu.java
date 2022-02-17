package com.fox.university.ui;

import java.util.Scanner;

import com.fox.university.menuitem.LessonMenu;
import com.fox.university.menuitem.StudentMenu;
import com.fox.university.menuitem.TeacherMenu;

public class Menu {

	public void start() {
		TeacherMenu teacherMenu = new TeacherMenu();
		StudentMenu studentMenu = new StudentMenu();
		LessonMenu lessonMenu = new LessonMenu();

		Scanner sc = new Scanner(System.in);
		int option, subOption;

		do {
			startMainMenu();
			option = sc.nextInt();

			switch (option) {
			case 1: {

				do {
					startSubMenuForTeachers();
					subOption = sc.nextInt();

					chooseSubOptionsForTeacher(teacherMenu, sc, subOption);

				} while (subOption != 6);
				break;
			}

			case 2:

			{
				do {
					startSubMenuForStudents();
					subOption = sc.nextInt();

					chooseSubOptionsForStudent(studentMenu, sc, subOption);

				} while (subOption != 6);
				break;
			}

			case 3: {

				do {
					startSubMenuForLessons();
					subOption = sc.nextInt();

					chooseSubOptionsForLesson(lessonMenu, sc, subOption);

				} while (subOption != 3);
				break;

			}

			case 4:
				System.out.println("You selected to Exit");
				System.exit(0);
				break;
			}

		} while (option != 6);

	}

	public void startMainMenu() {
		System.out.println("+------------------------------------------------+ :");
		System.out.println("| Welcome to Application `University Management` |");
		System.out.println("+------------------------------------------------+ :");

		System.out.println("Main Menu:");
		System.out.println("1. Manage Teachers");
		System.out.println("2. Manage Students");
		System.out.println("3. Manage Lessons");
		System.out.println("4. Exit");
		System.out.println("Enter your option [1,2,3,4]:");
	}

	public void startSubMenuForTeachers() {
		System.out.println("Teachers Sub-Menu:");
		System.out.println("1. Create a Teacher");
		System.out.println("2. Update a Teacher");
		System.out.println("3. Delete a Teacher");
		System.out.println("4. Read All Teachers");
		System.out.println("5. Search a Teacher");
		System.out.println("6. Exit");
		System.out.println("Enter your option [1,2,3,4,5,6]:");
	}

	public void chooseSubOptionsForTeacher(TeacherMenu teacherMenu, Scanner sc, int subOption) {
		switch (subOption) {
		case 1: {
			System.out.println("Create a Teacher");
			teacherMenu.addTeacher(sc);
			break;
		}
		case 2: {
			System.out.println("Update a Teacher");
			teacherMenu.updateTeacher(sc);
			break;
		}
		case 3: {
			System.out.println("Delete a Teacher");
			teacherMenu.deleteTeacher(sc);
			break;
		}
		case 4: {
			System.out.println("Read All Teachers");
			teacherMenu.readAllTeachers();
			break;
		}
		case 5: {
			System.out.println("Search a Teacher");
			teacherMenu.searchTeacher(sc);
			break;
		}
		case 6: {
			System.out.println("Exit");
			break;
		}
		}
	}

	public void startSubMenuForStudents() {
		System.out.println("Students Sub-Menu:");
		System.out.println("1. Create a Student");
		System.out.println("2. Update a Student");
		System.out.println("3. Delete a Student");
		System.out.println("4. Read All Students");
		System.out.println("5. Search a Student");
		System.out.println("6. Exit");
		System.out.println("Enter your option [1,2,3,4,5,6]:");
	}

	public void chooseSubOptionsForStudent(StudentMenu studentMenu, Scanner sc, int subOption) {
		switch (subOption) {
		case 1: {
			System.out.println("Create a Student");
			studentMenu.addStudent(sc);
			break;
		}
		case 2: {
			System.out.println("Update a Student");
			studentMenu.updateStudent(sc);
			break;
		}
		case 3: {
			System.out.println("Delete a Student");
			studentMenu.deleteStudent(sc);
			break;
		}
		case 4: {
			System.out.println("Read All Students");
			studentMenu.readAllStudents();
			break;
		}
		case 5: {
			System.out.println("Search a Student");
			studentMenu.searchStudent(sc);
			break;
		}
		case 6: {
			System.out.println("Exit");
			break;
		}
		}
	}

	public void startSubMenuForLessons() {
		System.out.println("Lessons Sub-Menu:");
		System.out.println("1. Add lesson ");
		System.out.println("2. Read All Lessons");
		System.out.println("3. Exit");
		System.out.println("Enter your option [1,2,3]:");
	}

	public void chooseSubOptionsForLesson(LessonMenu lessonMenu, Scanner sc, int subOption) {
		switch (subOption) {
		case 1: {
			System.out.println("Add a lesson");
			lessonMenu.addLesson(sc);
			break;
		}
		case 2: {
			System.out.println("Read All Lessons");
			lessonMenu.readAllLessons();
			break;
		}

		case 3: {
			System.out.println("Exit");
			break;
		}
		}
	}
}
