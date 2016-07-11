package com.pfy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.domain.entity.Roles;
import com.pfy.domain.entity.UserDetails;

@RestController
public class UserController {

	@RequestMapping(value="/users/{id}")
	public UserDetails getUserById(@PathVariable String id)
	{
	
		UserDetails userDetails=new UserDetails();
		List<Roles> listRoles=new ArrayList<Roles>();
		Roles roles=new Roles();
		Roles roles1=new Roles();
		roles.setId("1");
		roles.setRoleName("Admin");
		listRoles.add(roles);
		roles1.setId("2");
		roles1.setRoleName("Manager");
		listRoles.add(roles1);
		userDetails.setId(id);
		userDetails.setFirstName("Emma");
		userDetails.setLastName("Peter");
		userDetails.setImageURL("https://i.imgsafe.org/34a51bb14c.png");
		userDetails.setRoles(listRoles);
		return userDetails;
	}
}
