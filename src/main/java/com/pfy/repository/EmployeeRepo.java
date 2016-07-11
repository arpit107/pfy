package com.pfy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfy.domain.entity.EmployeeDetailss;

public interface EmployeeRepo extends JpaRepository<EmployeeDetailss, Integer> {

}
