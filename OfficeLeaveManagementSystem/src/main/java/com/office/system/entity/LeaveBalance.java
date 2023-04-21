package com.office.system.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Leave_Balances")
public class LeaveBalance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long LeaveBalanceId;
	
	@ManyToOne
	@JoinColumn(name="employeeid")
	private Employee employee;
	
	@Enumerated(EnumType.STRING)
	private LeaveType type;
	private long balance;
	public long getLeaveBalanceId() {
		return LeaveBalanceId;
	}
	public void setLeaveBalanceId(long leaveBalanceId) {
		LeaveBalanceId = leaveBalanceId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public LeaveType getType() {
		return type;
	}
	public void setType(LeaveType type) {
		this.type = type;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public LeaveBalance(long leaveBalanceId, Employee employee, LeaveType type, long balance) {
		super();
		LeaveBalanceId = leaveBalanceId;
		this.employee = employee;
		this.type = type;
		this.balance = balance;
	}
	public LeaveBalance() {
		super();
	}
	
	
	
}
