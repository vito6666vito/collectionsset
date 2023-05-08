package com.service;

import com.collectionsset.springdemo.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String secondName);

    Employee remove(String firstName, String secondName);

    Employee find(String firstName, String secondName);

    Collection<Employee> findAll();
}
