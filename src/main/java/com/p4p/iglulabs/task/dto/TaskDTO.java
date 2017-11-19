package com.p4p.iglulabs.task.dto;

public class TaskDTO {

	private String taskId;
	private String taskDesc;
	private String objective;
	private String startDate;
	private String startTime;
	private String endTime;
	
	private String endDate;
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "TaskDTO [taskId=" + taskId + ", taskDesc=" + taskDesc + ", objective=" + objective + ", startDate="
				+ startDate + ", startTime=" + startTime + ", endTime=" + endTime + ", endDate=" + endDate + "]";
	} 
	
	
}
