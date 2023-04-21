package com.office.system.service;

import java.util.List;



import com.office.system.entity.LeaveBalance;

public interface ILeaveBalance {
	
	public LeaveBalance addLeaveBalance(LeaveBalance leaveBalance);
	
	
	public LeaveBalance updateLeaveBalance(LeaveBalance leaveBalance);
	
	
	public LeaveBalance getLeaveBalanceById(long LeaveBalanceId);
	
	
	
	public List<LeaveBalance>getAllLeaveBalances();


	LeaveBalance updateBalance(long LeaveBalanceId, long Balance);


	//LeaveBalance updateEmployeeAbsenteesium(long employeeid);

}
