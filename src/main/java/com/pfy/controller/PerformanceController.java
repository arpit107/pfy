package com.pfy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfy.domain.entity.Performance;

@RestController
public class PerformanceController {

	@RequestMapping(value="/users/{id}/performances")
	public List<Performance> listPerformance(@PathVariable String id)
	{
		Performance performance=new Performance();
		Performance performance1=new Performance();
		Performance performance2=new Performance();
		List<Performance> performances=new ArrayList<Performance>();
		performance.setDuration("yesterday");
		performance.setActual(6);
		performance.setTotal(8);
		performance1.setDuration("last 30 days");
		performance1.setActual(140);
		performance1.setTotal(200);
		performance2.setDuration("last 3 months");
		performance2.setActual(450);
		performance2.setTotal(600);
		performances.add(performance);
		performances.add(performance1);
		performances.add(performance2);
		return performances;
	}
}
