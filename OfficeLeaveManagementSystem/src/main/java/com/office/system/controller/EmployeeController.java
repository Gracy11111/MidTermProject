package com.office.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.office.system.entity.Employee;
import com.office.system.repository.EmployeeRepository;
import com.office.system.service.IEmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees() {
		
		return service.getAllEmployees();
		
	}
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		System.out.println("Details added sucessfully");
		
		return service.addEmployee(employee);
	}
	
	
	@GetMapping("/get/{employeeid}")
	public Employee getById(@PathVariable long employeeid) {
		
		return service.getEmployeeById(employeeid);
	}
	
	
	
	
}
