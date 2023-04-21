package com.office.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.office.system.entity.LeaveBalance;
import com.office.system.repository.EmployeeRepository;
import com.office.system.service.ILeaveBalance;

@RestController
@RequestMapping("/api/balance")
public class BalanceController {
	
	@Autowired
	ILeaveBalance service;
	
	@Autowired
	EmployeeRepository repo;
	
	
	@PostMapping("/addbalance")
	public LeaveBalance addLeaveBalance(LeaveBalance leaveBalance) {
		
		System.out.println("LeaveBalance Added Sucessfully");
		
		return service.addLeaveBalance(leaveBalance);
	}
	
	@GetMapping("/getall")
	public List<LeaveBalance>getAllLeaveBalances(){
		
		return service.getAllLeaveBalances();
	}
	
	
	@PutMapping("/update")
	public LeaveBalance updateLeaveBalance(@RequestBody LeaveBalance leaveBalance) {
		
		 return service.updateLeaveBalance(leaveBalance);
	}
	
	@PutMapping("/balance/{leaveBalanceId}/{balanceId}")
	public LeaveBalance updateBalance(@PathVariable  long LeaveBalanceId,@PathVariable long BalanceId) {
		
		return service.updateBalance(LeaveBalanceId, BalanceId);
		
	}
	
	@GetMapping("/get/{leaveBalanceId}")
	public LeaveBalance getLeaveBalanceById(@PathVariable long LeaveBalanceId) {
		return service.getLeaveBalanceById(LeaveBalanceId);
	}
//	
//	@PutMapping("/absenteism/{employeeId}")
//	public LeaveBalance updateEmployeeAbsenteeism(@PathVariable long employeeid) {
//		return service.updateEmployeeAbsenteesium(employeeid);
//	}
//	
	
	
	

}
