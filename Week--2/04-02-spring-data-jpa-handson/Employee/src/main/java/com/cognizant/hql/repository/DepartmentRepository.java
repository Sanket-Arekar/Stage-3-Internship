package com.cognizant.hql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.hql.entity.Department;
import com.cognizant.hql.entity.Employee;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}
