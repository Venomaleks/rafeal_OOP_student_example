package com.exemple.Teknikhogskolan.rafeal_Student_example;

import java.util.ArrayList;

public class Classroom {

	private String classroomName = "";
	private String classroomTerm = "";
	private ArrayList<Student> students = new ArrayList<Student>();
	
	// the constructors to classroom
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {
		
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;
	}

	////////////////////////////
	//start geters and setters 
	public String getClassroomName() {
		return classroomName;
	}
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	
	public String getClassroomTerm() {
		return classroomTerm;
	}
	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}

	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	//end geters and setters 
	////////////////////////////
	
	
	// to remove student
	public void remmoveAStudent(String firstName) {
		
		int counter = 0;
		boolean studentExist = false;
		int indexToBeRemove = -1;
		
		while ((counter < students.size()) && (studentExist == false)) {
			
			// this if statment works with .equals and ==
			if(students.get(counter).getFirstName().equals(firstName)) {
				
				studentExist = true;
				indexToBeRemove = counter;
			}
			counter ++;
		}
		
		if (studentExist == true) {
			
			students.remove(indexToBeRemove);
			System.out.println("The student: " + firstName + " Succsessfully removed!");
			
		} else {
			
			System.out.println("The student dont exist!");
		}
		
	}
	
	//  to add student
	public void addAStudent(Student student) {
		
		students.add(student);
		
	}
	
	//to see all elements of element
	public void printFullRelatory() {
		
		System.out.println("Classroomname: " + classroomName);
		System.out.println("ClassroomTearm: " + classroomTerm);
		
		System.out.println();
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		
	}
	
	
	
}
