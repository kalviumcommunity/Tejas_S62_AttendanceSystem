package com.school;

public class AttendanceRecord{
    private 
    final int studentId;
    int courseId;
    String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        // this.status = status;
        if("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.status = status;
        } else {
            this.status = status;
            System.out.println("Invalid attendance status provided. Please use 'Present' or 'Absent'.");
            // throw new IllegalArgumentException("Status must be 'Present' or 'Absent'");
        }
    }

        public int getStudentId() {
            return studentId;
        }
        public int getCourseId() {
            return courseId;
        }
        public String getStatus(){
            return status;
        }

        public void displayDetails(){
            System.out.println("Attendance Record:");
            System.out.println("Student ID: " + studentId);
            System.out.println("Course ID: " + courseId);
            System.out.println("Status: " + status);
    }
}