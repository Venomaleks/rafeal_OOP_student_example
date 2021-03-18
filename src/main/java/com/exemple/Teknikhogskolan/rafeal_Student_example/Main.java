package com.exemple.Teknikhogskolan.rafeal_Student_example;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		Classroom cR = new Classroom("Software Tester", "Spring 2021", students);
		
		
		Student student1 = new Student(24, "Aleks", "Edholm", 'm', 5.0, 6.0, 3.0, 0.0);
		Student student2 = new Student(27, "Lars", "Burger", 'm', 9.0, 4.0, 7.0, 0.0);
		Student student3 = new Student(20, "Hanna", "Cruse", 'f', 7.0, 5.0, 9.0, 0.0);
		
		cR.addAStudent(student1);
		cR.addAStudent(student2);
		cR.addAStudent(student3);
		
		
		cR.printFullRelatory();
		
		cR.remmoveAStudent("Aleks");
		
		System.out.println("");
		
		cR.printFullRelatory();

	}

}
