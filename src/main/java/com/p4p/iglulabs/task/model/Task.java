package com.p4p.iglulabs.task.model;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Tasks")
public class Task implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "Subject")
    private String subject;
 
    @Column(name = "Objective")
    private String Objective;
 
    @Column(name = "StartTime")
    private String startTime;
 
    @Column(name = "StartDate")
    private Date startDate;
    
    @Column(name = "EndTime")
    private String endTime;
 
    @Column(name = "EndDate")
    private Date endDate;
    
    
    @Column(name = "Comments")
    private String Comments;
 
    @Column(name = "CrDate")
    private Date CrDate;
    
	@Column(name = "CrTime")
	private String CrTime;
	 
	@Column(name = "ChDate")
	private Date ChDate;
	 
	@Column(name = "ChTime")
	private String ChTime;
	 
	 

    public Task() {
    }



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getObjective() {
		return Objective;
	}



	public void setObjective(String objective) {
		Objective = objective;
	}



	public String getStartTime() {
		return startTime;
	}



	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public String getEndTime() {
		return endTime;
	}



	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public String getComments() {
		return Comments;
	}



	public void setComments(String comments) {
		Comments = comments;
	}



	public Date getCrDate() {
		return CrDate;
	}



	public void setCrDate(Date crDate) {
		CrDate = crDate;
	}



	public String getCrTime() {
		return CrTime;
	}



	public void setCrTime(String crTime) {
		CrTime = crTime;
	}



	public Date getChDate() {
		return ChDate;
	}



	public void setChDate(Date chDate) {
		ChDate = chDate;
	}



	public String getChTime() {
		return ChTime;
	}



	public void setChTime(String chTime) {
		ChTime = chTime;
	}


/*
	public Task( String subject, String objective, String startTime, Date startDate, String endTime,
			Date endDate, String comments, Date crDate, String crTime, Date chDate, String chTime) {
		super();
		subject = subject;
		Objective = objective;
		this.startTime = startTime;
		this.startDate = startDate;
		this.endTime = endTime;
		this.endDate = endDate;
		Comments = comments;
		CrDate = crDate;
		CrTime = crTime;
		ChDate = chDate;
		ChTime = chTime;
	}*/



	@Override
	public String toString() {
		return "Task [id=" + id + ", Subject=" + subject + ", Objective=" + Objective + ", startTime=" + startTime
				+ ", startDate=" + startDate + ", endTime=" + endTime + ", endDate=" + endDate + ", Comments="
				+ Comments + ", CrDate=" + CrDate + ", CrTime=" + CrTime + ", ChDate=" + ChDate + ", ChTime=" + ChTime
				+ "]";
	}
 
    
}
