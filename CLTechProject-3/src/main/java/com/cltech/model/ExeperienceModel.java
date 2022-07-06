package com.cltech.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="experience")
public class ExeperienceModel {
	
	
	@Id
	private long expierenceModelId;
	@Column(name="job_title")
	private String jobTitle;
	@Column(name="organization_Name")
	private String organizationName;
	@Column(name="job_Description")
	private String jobDescription;
	@Column(name="start_Date")
	private Date startDate;
	@Column(name="end_Date")
	private Date endDate;
	@Column(name="currently_Working")
	private boolean currentlyWorking;
	@Column(name="fk_employee_id")
	private long fk_employee_id;

	private int experienceId;
	
	public int getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(int experienceId) {
		this.experienceId = experienceId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isCurrentlyWrking() {
		return currentlyWorking;
	}
	public void setCurrentlyWrking(boolean currentlyWrking) {
		this.currentlyWorking = currentlyWrking;
	}
	public long getFk_employee_id() {
		return fk_employee_id;
	}
	public void setFk_employee_id(long fk_employee_id) {
		this.fk_employee_id = fk_employee_id;
	}
	public long getExpierenceModelId() {
		return expierenceModelId;
	}
	public void setExpierenceModelId(long expierenceModelId) {
		this.expierenceModelId = expierenceModelId;
	}
	public boolean isCurrentlyWorking() {
		return currentlyWorking;
	}
	public void setCurrentlyWorking(boolean currentlyWorking) {
		this.currentlyWorking = currentlyWorking;
	}
	

}
