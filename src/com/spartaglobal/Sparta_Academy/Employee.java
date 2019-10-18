package com.spartaglobal.Sparta_Academy;

public abstract class Employee {

    private String name;
    private double salary;
    private int age;
    private String gender;
    private String location;

    public Employee(String name, double salary, int age, String gender, String location) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }
}
