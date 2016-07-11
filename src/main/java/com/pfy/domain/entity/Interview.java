package com.pfy.domain.entity;

import java.util.List;

public class Interview {

	private String id;
	private Long date;
	private String company;
	private Candidate candidates;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Candidate getCandidates() {
		return candidates;
	}
	public void setCandidates(Candidate candidates) {
		this.candidates = candidates;
	}
	
	
	

	
}
