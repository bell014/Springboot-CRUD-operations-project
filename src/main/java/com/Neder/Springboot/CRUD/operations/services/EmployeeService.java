package com.Neder.Springboot.CRUD.operations.services;

import java.util.List;

import com.Neder.Springboot.CRUD.operations.models.Employee;



public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}