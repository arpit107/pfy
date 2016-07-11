package com.pfy.domain.entity;

public class AssignedPosition {

	private String id;
	private String positionName;
	private String company;
	private String jobLocation;
	private String SPOC;
	private Integer open;
	private Integer screened;
	private Integer shortlisted;
	private Integer selected;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getSPOC() {
		return SPOC;
	}
	public void setSPOC(String sPOC) {
		SPOC = sPOC;
	}
	public Integer getOpen() {
		return open;
	}
	public void setOpen(Integer open) {
		this.open = open;
	}
	public Integer getScreened() {
		return screened;
	}
	public void setScreened(Integer screened) {
		this.screened = screened;
	}
	public Integer getShortlisted() {
		return shortlisted;
	}
	public void setShortlisted(Integer shortlisted) {
		this.shortlisted = shortlisted;
	}
	public Integer getSelected() {
		return selected;
	}
	public void setSelected(Integer selected) {
		this.selected = selected;
	}
	
}
