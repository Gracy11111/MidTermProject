package com.office.system.service;

import java.util.List;

import com.office.system.entity.Employee;

public interface IEmployeeService {
	
	List<Employee> getAllEmployees();
	
	
	
	Employee getEmployeeById(long id);

	Employee addEmployee(Employee employee);

	

	
	
	

}
