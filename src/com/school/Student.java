package com.school;

public class Student extends Person {
    private int nextStudentIdCounter = 1;
    private int studentId;
    private String name;
    private String gradeLevel;

    // public Student(String name){
    //     this.studentId = nextStudentIdCounter++;
    //     this.name = name;
    // }

    public Student(String name, String gradeLevel){
        super(name);
        this.gradeLevel = gradeLevel;
    }

    public int getStudentId(){
        return studentId;
    }

    @Override
    public void displayDetails(){
        // System.out.println("Student ID: " + studentId);
        // System.out.println("Name: " + name);
        super.displayDetails();
        System.out.println(", Grade Level: " + gradeLevel + ", Role: (student)");
        // System.out.println("Role: Student");
    }
}