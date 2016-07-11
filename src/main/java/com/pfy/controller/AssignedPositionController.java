package com.pfy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.domain.entity.AssignedPosition;

@RestController
public class AssignedPositionController {

	@RequestMapping(value="/users/{id}/assigned-position-status")
	public List<AssignedPosition> listPositions(@PathVariable String id)
	{
		AssignedPosition assignedPosition=new AssignedPosition();
		AssignedPosition assignedPosition1=new AssignedPosition();
		List<AssignedPosition> listPositions=new ArrayList<AssignedPosition>();
				
		assignedPosition.setId(id);
		assignedPosition.setCompany("Google");
		assignedPosition.setJobLocation("Pune");
		assignedPosition.setOpen(10);
		assignedPosition.setPositionName("Java Developer");
		assignedPosition.setScreened(20);
		assignedPosition.setSelected(5);
		assignedPosition.setShortlisted(12);
		assignedPosition.setSPOC("Ajay Kumar");
		
		assignedPosition1.setId(id);
		assignedPosition1.setCompany("Yahoo");
		assignedPosition1.setJobLocation("Pune");
		assignedPosition1.setOpen(10);
		assignedPosition1.setPositionName("Angular Developer");
		assignedPosition1.setScreened(20);
		assignedPosition1.setSelected(5);
		assignedPosition1.setShortlisted(12);
		assignedPosition1.setSPOC("Ajay Kumar");
		
		listPositions.add(assignedPosition);
		listPositions.add(assignedPosition1);
		return listPositions;
	}
}
