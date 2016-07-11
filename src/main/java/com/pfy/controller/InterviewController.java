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
		List<Candidate> candidates=new ArrayList<Candidate>();
		List<Interview> interviews=new ArrayList<Interview>();
		Interview interview=new Interview();
		Interview interview1=new Interview();
		
		Candidate candidate=new Candidate();
		Candidate candidate1=new Candidate();
		candidate.setId("1");
		candidate.setName("Ajay Singh");
		candidate1.setId("2");
		candidate1.setName("Shreya Bansal");
		candidates.add(candidate);
		candidates.add(candidate1);
		interview.setId("1");
		interview.setCompany("Google");
		interview.setCandidates(candidates);
		interview.setDate(1468502702L);
		
		interview1.setId("2");
		interview1.setCompany("Yahoo");
		interview1.setCandidates(candidates);
		interview1.setDate(1468416302L);
		
		interviews.add(interview);
		interviews.add(interview1);
		return interviews;
	}
}
