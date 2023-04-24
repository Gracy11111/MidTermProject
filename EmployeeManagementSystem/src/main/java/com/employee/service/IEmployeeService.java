package com.employee.service;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeIDException;

public interface IEmployeeService {
	
	public Employee getEmployeeByEmployeeId(int employeeId) throws EmployeeIDException;

}
