package com.cognizant.hql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.hql.entity.Employee;
import com.cognizant.hql.entity.Skill;

@Repository
public interface SkillRepository  extends JpaRepository<Skill, Integer> {

}
