package com.cognizant.hql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hql.MainApplication;
import com.cognizant.hql.entity.Employee;
import com.cognizant.hql.entity.Skill;
import com.cognizant.hql.repository.EmployeeRepository;
import com.cognizant.hql.repository.SkillRepository;

@Service
public class EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

	@Autowired
	EmployeeRepository employeeRepo;

	@Transactional
	public Employee get(int id) {
		LOGGER.info("Start");
		return employeeRepo.findById(id).get();
	}

	@Transactional
	public void save(Employee employee) {
		LOGGER.info("Start");
		employeeRepo.save(employee);
		LOGGER.info("End");
	}
	
	
	@Transactional
    public void updateEmployee(Employee employee) {
		LOGGER.info("Start");
        employeeRepo.save(employee);
        LOGGER.info("End");
    }

	@Transactional
    public void addEmployee(Employee employee) {
		LOGGER.info("Start");
        employeeRepo.save(employee);
        LOGGER.info("End");
    }
}
