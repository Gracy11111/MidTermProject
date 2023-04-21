package com.office.system.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.system.entity.LeaveRequest;
import com.office.system.repository.LeaveRepository;

@Service
public class LeaveServiceImp implements ILeaveService {
	
	@Autowired
	LeaveRepository lrepo;

	@Override
	public LeaveRequest addLeaveRequest(LeaveRequest leaveRequest) {
		
		return lrepo.save(leaveRequest);
	}

	@Override
	public List<LeaveRequest> viewAllLeaveRequest() {
		
		return lrepo.findAll();
	}

	@Override
	public Long deleteLeaveRequest(Long id) {
		lrepo.deleteById(id);
		 return id;
	}

	
	@Override
	public LeaveRequest findLeaveRequestById(Long id) {
		return lrepo.findLeaveRequestById(id);
	}

	@Override
	public LeaveRequest updateLeaveRequestById(Long id, LeaveRequest leaveRequest) {
		
		return lrepo.save(leaveRequest);
	}

	
	}
