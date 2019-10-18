package com.spartaglobal.Sparta_Academy;

public class Staff extends Employee {
    private boolean permissions;
    public Staff(String name, double salary, int age, String gender, String location, boolean permissions) {
        super(name, salary, age, gender, location);
        this.permissions = permissions;

    }
}
