package com.office.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.system.entity.Employee;
import com.office.system.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService{
	
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

		
	@Override
	public Employee getEmployeeById(long id) {
		
		Optional<Employee> optional = repo.findById(id);
		Employee employee;
		if (optional.isPresent()) {
			employee =  optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return repo.save(employee);
	}
	
		
}
