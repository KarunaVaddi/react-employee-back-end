package com.react.employees.services;

import java.util.List;

import com.react.employees.entities.Employee;

public interface EmployeeService {
	
   void addEmployee(Employee e);
   void updateEmployee(Employee e);
   Employee getEmployee(Long id);
   List<Employee> getAllEmployees();
}
