package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeIDException;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) throws EmployeeIDException {
		Employee employee = repo.findById(employeeId).orElseThrow(()->new EmployeeIDException("Invalid EmployeeID"));
		
		
	return employee;
	}

}
