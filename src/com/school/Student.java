package com.school;

public class Student{
    private int nextStudentIdCounter = 1;
    private int studentId;
    private String name;

    public Student(String name){
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
    }
}