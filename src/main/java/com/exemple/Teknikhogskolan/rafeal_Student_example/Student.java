package com.exemple.Teknikhogskolan.rafeal_Student_example;

import java.text.DecimalFormat;

public class Student extends Person {

	private double firstGread = 0.0;
	private double secondGread = 0.0;
	private double thirdGread = 0.0;
	private double averageGread = 0.0;

	// Person element constructro
	public Student(int age, String firstName, String lastName, char gender) {
		super(age, firstName, lastName, gender); // super anropar bara alla atribut

	}

	// all element costructor
	public Student(int age, String firstName, String lastName, char gender, double firstGread, double secondGread,
			double thirdGread, double averageGread) {
		super(age, firstName, lastName, gender); // super linkes atribut

		this.firstGread = firstGread;
		this.secondGread = secondGread;
		this.thirdGread = thirdGread;
		this.averageGread = averageGread;

	}

	////////////////////////////////////
	// geters setters
	public double getFirstGread() {
		return firstGread;
	}

	public void setFirstGread(double firstGread) {
		this.firstGread = firstGread;
	}

	public double getSecondGread() {
		return secondGread;
	}

	public void setSecondGread(double secondGread) {
		this.secondGread = secondGread;
	}

	public double getThirdGread() {
		return thirdGread;
	}

	public void setThirdGread(double thirdGread) {
		this.thirdGread = thirdGread;
	}

	public double getAverageGread() {
		return averageGread;
	}

	public void setAverageGread(double averageGread) {
		this.averageGread = averageGread;
	}
	// end of geters and seters
	////////////////////////////////////

	// the resturn calculater values
	public double calculateAvrageGread() {

		double avr = (firstGread + secondGread + thirdGread) / 3;
		setAverageGread(avr);

		return avr;
	}

	public double calculateAvrageGread(double firstGread, double secondGread, double thirdGread) {

		double avr = (firstGread + secondGread + thirdGread) / 3;
		setAverageGread(avr);

		return avr;
	}

	public boolean hasClearedTheCourse() {

		if (getAverageGread() < 6) {
			return false;
		}

		return true;
	}

	// string return
	public String toString() {
	
		calculateAvrageGread(getFirstGread(), getSecondGread(), getThirdGread());
		DecimalFormat df = new DecimalFormat("#.0");
		
		if(hasClearedTheCourse()) {
			return "Student " + getFirstName() + " " + getLastName() + "\n" + "Greades: " + " T1: " + this.firstGread + " T2: " + this.secondGread + " T3: " + this.thirdGread + "\nThe studnet has cleared the course\n----------------";
		}
		else {
			
			return "Student " + getFirstName() + " " + getLastName() + "\n" + "Greades: " + " T1: " + this.firstGread + " T2: " + this.secondGread + " T3: " + this.thirdGread + "\nThe studnet has FAILED the course\n----------------";
		}

		
	}

}
