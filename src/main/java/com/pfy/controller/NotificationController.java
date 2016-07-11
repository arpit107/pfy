package com.pfy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.domain.entity.Candidate;
import com.pfy.domain.entity.Notification;

@RestController
public class NotificationController {

	@RequestMapping(value="/users/{id}/notifications")
	public List<Notification> listNotifications()
	{
		List<Notification> notifications=new ArrayList<Notification>();
		Notification notification=new Notification();
		Notification notification1=new Notification();
		Notification notification2=new Notification();
		Notification notification3=new Notification();
		Notification notification4=new Notification();
		
		Candidate candidate=new Candidate();
		candidate.setId("1");
		candidate.setName("Rashmi Bansal");
		
		Candidate candidate2=new Candidate();
		candidate2.setId("2");
		candidate2.setName("Ajay Singh");
		
		Candidate candidate3=new Candidate();
		candidate3.setId("3");
		candidate3.setName("Prashant");
		
		Candidate candidate4=new Candidate();
		candidate4.setId("4");
		candidate4.setName("Raj Kumar");
		
		Candidate candidate5=new Candidate();
		candidate5.setId("5");
		candidate5.setName("John Peter");
		
		notification.setId("1");
		notification.setDate(1468761902L);
		notification.setCompany("Google");
		notification.setBody("interview scheduled with");
		notification.setCandidate(candidate);
		notification.setType("critical");
		
		notification1.setId("2");
		notification1.setDate(1468761902L);
		notification1.setCompany("Google");
		notification1.setBody("interview scheduled with");
		notification1.setCandidate(candidate2);
		notification1.setType("critical");
		
		notification2.setId("3");
		notification2.setDate(1468761902L);
		notification2.setCompany("");
		notification2.setBody("follow up scheduled");
		notification2.setCandidate(candidate3);
		notification2.setType("normal");
		
		notification3.setId("4");
		notification3.setDate(1468761902L);
		notification3.setCompany("Yahoo");
		notification3.setBody("interview scheduled with");
		notification3.setCandidate(candidate4);
		notification3.setType("normal");
		
		notification4.setId("5");
		notification4.setDate(1468761902L);
		notification4.setCompany("");
		notification4.setBody("Follow Up scheduled");
		notification4.setCandidate(candidate5);
		notification4.setType("critical");
		
		notifications.add(notification);
		notifications.add(notification1);
		notifications.add(notification2);
		notifications.add(notification3);
		notifications.add(notification4);
		return notifications;
	}
}
