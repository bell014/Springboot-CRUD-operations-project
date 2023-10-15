package com.Neder.Springboot.CRUD.operations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Neder.Springboot.CRUD.operations.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
