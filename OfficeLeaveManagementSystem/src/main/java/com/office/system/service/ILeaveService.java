package com.office.system.service;





import java.util.List;



import com.office.system.entity.LeaveRequest;

public interface ILeaveService {
	
	
	LeaveRequest addLeaveRequest(LeaveRequest leaveRequest);
	
	List<LeaveRequest> viewAllLeaveRequest();
	
	
	
	Long deleteLeaveRequest(Long id);
	
	
	LeaveRequest findLeaveRequestById(Long id);

	LeaveRequest updateLeaveRequestById(Long id, LeaveRequest leaveRequest);
}
