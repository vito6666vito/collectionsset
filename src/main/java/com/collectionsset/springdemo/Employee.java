package com.collectionsset.springdemo;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String secondName;

    public Employee(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
