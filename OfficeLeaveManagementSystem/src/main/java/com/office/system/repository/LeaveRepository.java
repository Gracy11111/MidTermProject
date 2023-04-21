package com.office.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office.system.entity.LeaveRequest;

public interface LeaveRepository extends JpaRepository<LeaveRequest,Long> {

	LeaveRequest findLeaveRequestById(Long id);

}
