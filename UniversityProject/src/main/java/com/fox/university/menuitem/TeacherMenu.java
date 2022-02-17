package com.fox.university.menuitem;

import java.util.ArrayList;
import java.util.Scanner;

import com.fox.university.model.Address;
import com.fox.university.model.Cathedra;
import com.fox.university.model.Degree;
import com.fox.university.model.Gender;
import com.fox.university.model.Subject;
import com.fox.university.model.Teacher;

public class TeacherMenu {

	ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	ArrayList<Subject> subjects = new ArrayList<>();

	public void addTeacher(Scanner input) {
		int teacherId = teachers.size() + 1;
		System.out.println("First name :");
		String firstName = input.next();
		System.out.println("Last name :");
		String lastName = input.next();
		System.out.println("Enter gender  MALE of FEMALE:");
		Gender gender = Gender.valueOf(input.next());
		System.out.println("Enter degree in the form BACHELOR, MASTER, DOCTOR or PROFESSOR  :");
		Degree degree = Degree.valueOf(input.next());

		System.out.println("Subjects :");
		Subject subject = new Subject();
		System.out.println("Id for subject :");
		subject.setId(input.nextInt());
		System.out.println("Name of subject :");
		subject.setName(input.next());
		System.out.println("Description of subject :");
		subject.setDescription(input.next());
		subjects.add(subject);

		System.out.println("Name of Cathedra :");
		Cathedra cathedra = new Cathedra();
		cathedra.setName(input.next());
		System.out.println("Id for Cathedra :");
		cathedra.setId(input.nextInt());
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

		Teacher teacher = new Teacher(teacherId, firstName, lastName, gender, degree, subjects, cathedra,
				telephoneNumber, email, address);

		teacher.setId(teacherId);
		teacher.setFirstName(firstName);
		teacher.setLastName(lastName);
		teacher.setGender(gender);
		teacher.setDegree(degree);
		teacher.setSubjects(subjects);
		teacher.setCathedra(cathedra);
		teacher.setPhone(telephoneNumber);
		teacher.setEmail(email);
		teacher.setAddress(address);
		teachers.add(teacher);
		System.out.println("Successfully added !");
	}

	public void updateTeacher(Scanner input) {
		System.out.println(" Enter the identification number  : ");
		int teacherId = input.nextInt();
		System.out.println("First name :");
		String firstName = input.next();
		System.out.println("Last name :");
		String lastName = input.next();
		System.out.println("Enter gender  MALE of FEMALE:");
		Gender gender = Gender.valueOf(input.next());
		System.out.println("Enter degree in the form BACHELOR, MASTER, DOCTOR or PROFESSOR  :");
		Degree degree = Degree.valueOf(input.next());

		System.out.println("Subjects :");
		Subject subject = new Subject();
		System.out.println("Id for subject :");
		subject.setId(input.nextInt());
		System.out.println("Name of subject :");
		subject.setName(input.next());
		System.out.println("Description of subject :");
		subject.setDescription(input.next());
		subjects.add(subject);

		System.out.println("Cathedra :");
		Cathedra cathedra = new Cathedra();
		cathedra.setName(input.next());
		System.out.println(" Id for Cathedra :");
		cathedra.setId(input.nextInt());
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

		Teacher teacher = new Teacher(teacherId, firstName, lastName, gender, degree, subjects, cathedra,
				telephoneNumber, email, address);

		teacher.setId(teacherId);
		teacher.setFirstName(firstName);
		teacher.setLastName(lastName);
		teacher.setGender(gender);
		teacher.setDegree(degree);
		teacher.setSubjects(subjects);
		teacher.setCathedra(cathedra);
		teacher.setPhone(telephoneNumber);
		teacher.setEmail(email);
		teacher.setAddress(address);
		teachers.set(teacherId - 1, teacher);

		System.out.println("Successfully modified !");
	}

	public void deleteTeacher(Scanner input) {
		int idForTeacher;
		System.out.println("  Enter the identification number  : ");
		idForTeacher = input.nextInt();
		if (teachers.size() == 0) {
			System.out.println("Sorry , the teachers list is empty");
		} else {

			teachers.remove(idForTeacher - 1);
			System.out.println("the teacher is removed");

		}
	}

	public void readAllTeachers() {
		if (teachers.size() == 0) {
			System.out.println("there are no teachers");
		} else {
			for (int i = 0; i < teachers.size(); i++) {
				System.out.println(teachers.get(i));
			}
		}
	}

	public void searchTeacher(Scanner input) {
		int index;
		System.out.println("Give me the id to search");
		index = input.nextInt();
		System.out.println(teachers.get(index - 1));
	}
}
