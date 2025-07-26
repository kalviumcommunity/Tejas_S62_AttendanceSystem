package com.school;

class Person{
    private static int nextIdCounter = 1;
    protected int id;
    protected String name;

    public Person(String name) {
        this.name = name;
        this.id = nextIdCounter++;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void displayDetails() {
        System.out.print("ID: " + id + ", Name: " + name);
        // System.out.println("Name: " + name);
    }
}