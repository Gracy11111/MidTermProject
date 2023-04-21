package com.office.system.entity;

import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="leave_request")
public class LeaveRequest {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	    
	    @Column(name = "start_date")
	    private LocalDate startDate;
	    
	    
	    @Column(name = "end_date")
	    private LocalDate endDate;
	    
	    
	    @Column(name = "type")
	    @Enumerated(EnumType.STRING)
	    private LeaveType type;

	    @Column(name = "status")
	    @Enumerated(EnumType.STRING)
	    private LeaveStatus status;

	    @Column(name = "comments")
	    private String comments;

	    @ManyToOne
	    @JoinColumn(name = "employeeid")
	    private Employee employee;
	    
	    
	    private String reason;
	    
	   
	    private String duration;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public LeaveType getType() {
			return type;
		}

		public void setType(LeaveType type) {
			this.type = type;
		}

		public LeaveStatus getStatus() {
			return status;
		}

		public void setStatus(LeaveStatus status) {
			this.status = status;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}

		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public LeaveRequest(Long id, LocalDate startDate, LocalDate endDate, LeaveType type, LeaveStatus status,
				String comments, Employee employee, String reason, String duration) {
			super();
			this.id = id;
			this.startDate = startDate;
			this.endDate = endDate;
			this.type = type;
			this.status = status;
			this.comments = comments;
			this.employee = employee;
			this.reason = reason;
			this.duration = duration;
		}

		public LeaveRequest() {
			super();
		}
	    
	    


			 


	
	

}
