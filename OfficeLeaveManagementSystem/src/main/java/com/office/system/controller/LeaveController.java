package com.office.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.office.system.entity.LeaveRequest;
import com.office.system.repository.EmployeeRepository;
import com.office.system.service.ILeaveService;

@RestController
@RequestMapping("api/leaves")
public class LeaveController {
	
	@Autowired
	ILeaveService service;
	
	@Autowired
	EmployeeRepository repo;
	
	@PostMapping("/addleave")
	public ResponseEntity<?> addLeaveRequest(@RequestBody LeaveRequest leaveRequest){
		
		System.out.println("Leave Request applied Sucessfully");
		
		return new ResponseEntity<>(service.addLeaveRequest(leaveRequest),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<List<LeaveRequest>> getLeaveRequest(){
		return new ResponseEntity<List<LeaveRequest>>(service.viewAllLeaveRequest(), HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?>getLeaveRequestById(@PathVariable("id") Long id){
		
		return new ResponseEntity<LeaveRequest>(service.findLeaveRequestById(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<LeaveRequest>updateLeaveRequestById(@RequestBody LeaveRequest leaveRequest,@PathVariable("id") Long id){
		
		System.out.println("Request updated successfully");
		
		return new ResponseEntity<LeaveRequest>(service.updateLeaveRequestById(id, leaveRequest), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteById(@PathVariable("id") Long id){
		
		System.out.println("Request Deleted Sucessfully");
		
		return new ResponseEntity<>(service.deleteLeaveRequest(id), HttpStatus.OK);
		
		
	}
	
}
	


