package com.react.employees.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.employees.entities.Employee;
import com.react.employees.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void addEmployee(Employee e) {
		repo.save(e);
	}
	
	@Override
	public void updateEmployee(Employee e) {
		repo.save(e);
	}
	
	@Override
	public Employee getEmployee(Long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}
}
