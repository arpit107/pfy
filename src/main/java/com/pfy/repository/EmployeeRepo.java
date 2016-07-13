package com.pfy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.pfy.domain.entity.EmployeeDetailss;

@Transactional
public interface EmployeeRepo extends JpaRepository<EmployeeDetailss, Integer> {

}
