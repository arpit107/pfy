package com.pfy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.domain.entity.Candidate;
import com.pfy.domain.entity.Interview;

@RestController
public class InterviewController {

	@RequestMapping(value="/users/{id}/interviews")
	public List<Interview> listInterviews(@PathVariable String id)
	{
		List<Interview> interviews=new ArrayList<Interview>();
		Interview interview=new Interview();
		Interview interview1=new Interview();
		
		Candidate candidate=new Candidate();
		Candidate candidate1=new Candidate();
		candidate.setId("1");
		candidate.setName("Ajay Singh");
		candidate1.setId("2");
		candidate1.setName("Shreya Bansal");
		
		interview.setId("1");
		interview.setCompany("Google");
		interview.setCandidate(candidate);
		interview.setDate(1468502702L);
		
		interview1.setId("2");
		interview1.setCompany("Yahoo");
		interview1.setCandidate(candidate1);
		interview1.setDate(1468416302L);
		
		interviews.add(interview);
		interviews.add(interview1);
		return interviews;
	}
}
