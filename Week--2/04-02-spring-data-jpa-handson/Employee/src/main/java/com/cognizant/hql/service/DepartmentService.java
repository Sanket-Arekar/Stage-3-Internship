package com.cognizant.hql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hql.MainApplication;
import com.cognizant.hql.entity.Department;
import com.cognizant.hql.entity.Employee;
import com.cognizant.hql.repository.DepartmentRepository;
import com.cognizant.hql.repository.EmployeeRepository;

@Service
public class DepartmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

	@Autowired
	DepartmentRepository departmentRepo;

	@Transactional
	public Department get(int id) {
		LOGGER.info("Start");
		return departmentRepo.findById(id).get();
	}

	@Transactional
	public void save(Department department) {
		LOGGER.info("Start");
		departmentRepo.save(department);
		LOGGER.info("End");
	}

}
