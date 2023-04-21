package com.office.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.office.system.entity.LeaveBalance;

@Repository
public interface ILeaveBalanceRepository extends JpaRepository<LeaveBalance,Long> {

	//LeaveBalance findLeaveBalanceByEmployeeAndLeaveType(Employee employee, LeaveType annual);

	
}
