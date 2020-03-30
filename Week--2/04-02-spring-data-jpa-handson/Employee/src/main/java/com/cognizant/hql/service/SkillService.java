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
import com.cognizant.hql.entity.Skill;
import com.cognizant.hql.repository.EmployeeRepository;
import com.cognizant.hql.repository.SkillRepository;

@Service
public class SkillService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);
	
	@Autowired
	SkillRepository skillRepo;
	
	
    @Transactional
    public Skill get(int id) {
        LOGGER.info("Start");
        return skillRepo.findById(id).get();
    }


    @Transactional
    public void save(Skill skill) {
        LOGGER.info("Start");
        skillRepo.save(skill);
        LOGGER.info("End");
    }

    
	
}
