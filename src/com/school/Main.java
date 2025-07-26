package com.school;

import java.util.*;

public class Main{
	public static void main(String[] args){
		System.out.println("Welcome to the Attendance System!");
		System.out.println("Info will be shared shortly.");

		// Student student1 = new Student("Alice wonderland");
		// Student student2 = new Student( "Bob the builder");

		// student1.displayDetails();
		// student2.displayDetails();
		// Course course1 = new Course("Mathematics");
		// Course course2 = new Course( "Science");

		// course1.displayDetails();
		// course2.displayDetails();

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
		// List<AttendanceRecord> attendanceLog = new ArrayList<>();
		
		// //Creating a student record and addin into the log
		// AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present");
		// attendanceLog.add(record1);
		// record1.displayDetails();

		// //creating invalid student record and adding into the log
		// AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Late");
		// attendanceLog.add(record2);
		// // record2.displayDetails();
		// System.out.println("Session 4 : Attendance records created successfully.");

			//session 5
			List<Person> person = new ArrayList<>();
			
			person.add(new Student("Alice Wonderland", "10"));
			person.add(new Student("Bob the Builder", "9"));
			person.add(new Teacher(null, null));
			person.add(new Staff(null, null));

			for(Person p: person){
				p.displayDetails();
			}

			Course course1 = new Course("Intro to quantam physics");
			System.out.println("\nAvailable Course");
			course1.displayDetails();
			
			List<AttendanceRecord> attendanceLog = new ArrayList<>();
			String[] status = {"Present", "Daydreaming "};

			for(int i=0; i<2; i++){
				Student student = (Student) person.get(i);
				AttendanceRecord record = new AttendanceRecord(student.getId(), course1.getCourseId(), status[i]);
				attendanceLog.add(record);
			}

			System.out.println("----Attendance log----");
			for(AttendanceRecord record: attendanceLog){
				record.displayDetails();
			}

			System.out.println("Session 5: Inheritance hierarchy established.");
			
		}
	}
