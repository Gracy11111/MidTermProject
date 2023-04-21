package com.office.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.office.system.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	

}
