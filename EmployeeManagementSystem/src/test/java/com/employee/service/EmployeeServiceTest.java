package com.employee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeIDException;

@SpringBootTest
class EmployeeServiceTest {

	@Autowired
	private IEmployeeService service;
	
	@Test
	void testGetEmployeeByEmployeeId() throws EmployeeIDException{
		Employee employee = service.getEmployeeByEmployeeId(111);
		assertNotNull(employee);
		assertEquals(111, employee.getEmployeeId());
	}

}

