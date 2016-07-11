package com.pfy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.domain.entity.Candidate;
import com.pfy.domain.entity.FollowUp;

@RestController
public class FollowUpController {

	@RequestMapping(value="/users/{id}/follow-ups")
	public List<FollowUp> listFollowUp(@PathVariable String id)
	{
		List<FollowUp> followUps=new ArrayList<FollowUp>();
		FollowUp followUp=new FollowUp();
		Candidate candidate=new Candidate();
		candidate.setId("1");
		candidate.setName("Ajay Singh");
		followUp.setId("1");
		followUp.setDate(1469280302L);
		followUp.setCandidate(candidate);
		followUps.add(followUp);
		return followUps;
	}
}
