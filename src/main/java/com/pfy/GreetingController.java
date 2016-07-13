package com.pfy;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.repository.EmployeeRepo;
import com.pfy.domain.entity.EmployeeDetailss;


@RestController
public class GreetingController {


	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	SessionFactory sessionFactory;
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam("name") String name) {
        return "Hello " + name+" !!";

    }

    @RequestMapping("/employees")
    @Transactional
    public List<EmployeeDetailss> listEmployeea()
    {
    	ArrayList<EmployeeDetailss> list=new ArrayList<EmployeeDetailss>();
    	EmployeeDetailss ed=new EmployeeDetailss();
    	Session session=sessionFactory.getCurrentSession();
    	Session session1=sessionFactory.getCurrentSession();
    	session.beginTransaction();
    	ed.setEmail("employee1@gmail.com");
    	ed.setName("Employee1");
    	ed.setId(1);
    	list.add(ed);
    	session.save(ed);
    	//repo.save(ed);
    	
    	ed.setEmail("employee2@gmail.com");
    	ed.setName("Employee2");
    	ed.setId(2);
    	list.add(ed);
    	
    	session1.save(ed);
    	List<EmployeeDetailss> list2=session.createQuery("from EmployeeDetailss").list();
    	//repo.save(ed);
    	
    	
    	
    	return list2;
    }
}
