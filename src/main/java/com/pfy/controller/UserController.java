package com.pfy.controller;

import java.util.ArrayList;

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
		ArrayList<Roles> listRoles=new ArrayList<Roles>();
		Roles roles=new Roles();
		roles.setId("1");
		roles.setRoleName("Admin");
		listRoles.add(roles);
		roles.setId("2");
		roles.setRoleName("Manager");
		listRoles.add(roles);
		userDetails.setId(id);
		userDetails.setFirstName("ABC");
		userDetails.setLastName("PQR");
		userDetails.setImageURL("https://i.imgsafe.org/34a51bb14c.png");
		userDetails.setRoles(listRoles);
		return userDetails;
	}
}
