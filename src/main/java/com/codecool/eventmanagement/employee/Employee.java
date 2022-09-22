package com.codecool.eventmanagement.employee;

public abstract class Employee {
    protected String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
