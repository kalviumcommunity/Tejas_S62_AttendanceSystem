package com.school;

public class Main{
	public static void main(String[] args){
		System.out.println("Welcome to the Attendance System!");
		System.out.println("Info will be shared shortly.");

		Student student1 = new Student(name:"Alice wonderland");
		Student student2 = mew Student(name: "Bob the builder");

		student1.displayDetails();
		student2.displayDetails();
		Course course1 = new Course(courseName: "Mathematics");
		Course course2 = new Course(courseName: "Science");

		course1.displayDetails();
		course2.displayDetails();

		// System.out.println(x:"\nRegistered Students:");
		// for(Student student: students){
		// 	if(student!=null){
		// 		student.displayDetails();
		// 	}
		// }

		// System.out.println(x:"\nAvailable Courses:");
		// for(Course course: courses){
		// 	if(course!=null){
		// 		course.displayDetails();
		// 	}
		// }
		// System.out.println(x:"\nSession 2: Core domain modelling complete");
	}
}