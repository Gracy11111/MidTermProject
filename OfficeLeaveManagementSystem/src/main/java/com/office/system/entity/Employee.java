package com.office.system.entity;







import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name="employee")
public class Employee {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long employeeid;
		
	  @NotNull
	  @Column(name="name")
	  private String name;
	  
	  @Column(name="email")
	  private String email;
	  
	  @NotNull
	  //@Pattern(regexp="[0-9]{10}",message="Mobile number must be of 10 digits")
	  @Column(name="phone")
	  private Long phone;
	  
	  @NotNull
	  @Column(name="department")
	  private String department;

	public Long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(Long employeeid, String name, String email, Long phone, String department) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.department = department;
	}

	public Employee() {
		super();
	}
	  
	  
	  

	 // private Integer leaveBalance;
	   
	  	  
	  



}
