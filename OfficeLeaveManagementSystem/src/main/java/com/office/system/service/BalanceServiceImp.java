package com.office.system.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.office.system.entity.LeaveBalance;

import com.office.system.repository.EmployeeRepository;
import com.office.system.repository.ILeaveBalanceRepository;

@Service
public class BalanceServiceImp implements ILeaveBalance {
	
	@Autowired
	ILeaveBalanceRepository brepo;
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public LeaveBalance addLeaveBalance(LeaveBalance leaveBalance) {
		
		return brepo.save(leaveBalance);
	}

	@Override
	public LeaveBalance updateLeaveBalance(LeaveBalance leaveBalance) {
		
		return brepo.save(leaveBalance);
	}

	@Override
	public LeaveBalance getLeaveBalanceById(long LeaveBalanceId) {
		
		LeaveBalance leaveBalance=brepo.findById(LeaveBalanceId).orElse(null);
		return leaveBalance;
	}

	

	@Override
	public List<LeaveBalance> getAllLeaveBalances() {
		
		return brepo.findAll();
	}

	@Override
	public LeaveBalance updateBalance(long LeaveBalanceId,long Balance) {
		
		LeaveBalance leaveBalance=brepo.findById(LeaveBalanceId).orElse(null);
		leaveBalance .setBalance(Balance);
		return brepo.save(leaveBalance);
		
		
	}
	
//	@Override
//	public LeaveBalance updateEmployeeAbsenteesium(long employeeid) {
//		Employee employee=repo.findById(employeeid).orElse(null);
//		LeaveBalance leaveBalance=brepo.findLeaveBalanceByEmployeeAndLeaveType(employee,LeaveType.Annual);
//		return updateBalance(leaveBalance.getLeaveBalanceId(),leaveBalance.getBalance()-1);
//		
//	}
	
	
	

}
