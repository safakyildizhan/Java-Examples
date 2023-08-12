package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	private int payment;
	
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:  ");
		this.gradeYear = in.nextInt();
		setStudentID();
		
		// System.out.println(firstName + " " + lastName + " " + gradeYear + " Student ID: " + studentID);
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade level + id
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits @ to quit
		do {	
			System.out.print("Enter course to enroll - Q to quit");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		} while (1!=0);
		
		// System.out.print("ENROLLED IN: " + courses);
		// System.out.println("TUITION BALANCE: " + tuitionBalance);

	}
	
	// View Balance
	public void viewBalance() {
		System.out.println("Your balance is $" + tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter the payment amount $");
		Scanner in = new Scanner(System.in);
		payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for payment of $" + payment);
		viewBalance();
	}
	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\n Student ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
		
	}

}
