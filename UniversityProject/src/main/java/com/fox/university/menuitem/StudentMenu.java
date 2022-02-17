package com.fox.university.menuitem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.fox.university.model.Address;
import com.fox.university.model.Gender;
import com.fox.university.model.Student;

public class StudentMenu {

	ArrayList<Student> students = new ArrayList<>();

	public void addStudent(Scanner input) {
		int studentId = students.size() + 1;
		System.out.println("First name :");
		String firstName = input.next();
		System.out.println("Last name :");
		String lastName = input.next();
		System.out.println("Enter birth date in format 2022-01-01 :");
		LocalDate birthDate = LocalDate.parse(input.next());
		System.out.println("Enter gender  MALE of FEMALE:");
		Gender gender = Gender.valueOf(input.next());
		System.out.println("telephone Number :");
		String telephoneNumber = input.next();
		System.out.println("Email :");
		String email = input.next();

		System.out.println("Address :");
		Address address = new Address();
		System.out.println("Enter id of address :");
		address.setId(input.nextInt());
		System.out.println("Country :");
		address.setCountry(input.next());
		System.out.println("Postal code :");
		address.setPostalCode(input.next());
		System.out.println("Region :");
		address.setRegion(input.next());
		System.out.println("City :");
		address.setCity(input.next());
		System.out.println("Address street :");
		address.setStreetAdress(input.next());

		Student student = new Student(studentId, firstName, lastName, birthDate, gender, telephoneNumber, email,
				address);

		student.setId(studentId);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setBirthDate(birthDate);
		student.setGender(gender);
		student.setPhone(telephoneNumber);
		student.setEmail(email);
		student.setAddress(address);
		students.add(student);
		System.out.println("Successfully added !");
	}

	public void updateStudent(Scanner input) {
		System.out.println(" Enter the identification number  : ");
		int studentId = input.nextInt();
		System.out.println("First name :");
		String firstName = input.next();
		System.out.println("Last name :");
		String lastName = input.next();
		System.out.println("Enter birth date in format 2022-01-01 :");
		LocalDate birthDate = LocalDate.parse(input.next());
		System.out.println("Enter gender  MALE of FEMALE:");
		Gender gender = Gender.valueOf(input.next());
		System.out.println("telephone Number :");
		String telephoneNumber = input.nextLine();
		System.out.println("Email :");
		String email = input.next();

		System.out.println("Address :");
		Address address = new Address();
		System.out.println("Enter id of address :");
		address.setId(input.nextInt());
		System.out.println("Country :");
		address.setCountry(input.next());
		System.out.println("Postal code :");
		address.setPostalCode(input.next());
		System.out.println("Region :");
		address.setRegion(input.next());
		System.out.println("City :");
		address.setCity(input.next());
		System.out.println("Address street :");
		address.setStreetAdress(input.next());

		Student student = new Student(studentId, firstName, lastName, birthDate, gender, telephoneNumber, email,
				address);

		student.setId(studentId);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setBirthDate(birthDate);
		student.setGender(gender);
		student.setPhone(telephoneNumber);
		student.setEmail(email);
		student.setAddress(address);
		students.set(studentId - 1, student);

		System.out.println("Successfully modified !");
	}

	public void deleteStudent(Scanner input) {
		int idForStudent;
		System.out.println("  Enter the identification number  : ");
		idForStudent = input.nextInt();
		if (students.size() == 0) {
			System.out.println("Sorry , the students list is empty");
		} else {

			students.remove(idForStudent - 1);
			System.out.println("the student is removed");

		}
	}

	public void readAllStudents() {
		if (students.size() == 0) {
			System.out.println("there are no students");
		} else {
			for (int i = 0; i < students.size(); i++) {
				System.out.println(students.get(i));
			}
		}
	}

	public void searchStudent(Scanner input) {
		int index;
		System.out.println("Give me the id to search");
		index = input.nextInt();
		System.out.println(students.get(index - 1));
	}
}
