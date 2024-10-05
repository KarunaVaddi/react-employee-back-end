package com.react.employees.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.employees.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
