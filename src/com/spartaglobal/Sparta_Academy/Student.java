package com.spartaglobal.Sparta_Academy;

public class Student extends Employee {
    private String course;
    
    public Student(String name, double salary, int age, String gender, String location, String course) {
        super(name, salary, age, gender, location);
        this.course = course;
    }
}
