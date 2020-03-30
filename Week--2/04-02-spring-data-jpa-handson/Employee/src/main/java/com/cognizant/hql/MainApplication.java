package com.cognizant.hql;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import com.cognizant.hql.entity.Department;
import com.cognizant.hql.entity.Employee;
import com.cognizant.hql.service.DepartmentService;
import com.cognizant.hql.service.EmployeeService;
import com.cognizant.hql.service.SkillService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class MainApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

	@Autowired
	private static EmployeeService employeeService;
	@Autowired
	private static DepartmentService departmentService;
	@Autowired
	private static SkillService skillService;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

		testGetEmployee();
	}

	private static void testGetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}

//	private static void testAddEmployee() {
//		LOGGER.info("Start");
//		Department department;
//		department.setDp_id(1);
//		department.setDp_name("Development");
//		
//		Employee employee = employeeService.addEmployee(Employee(1,"ABC",12000.1,true,14/12/2019,department));
//		LOGGER.info("End");
//	}
	
//	private static void testUpdateEmployee() {
//		LOGGER.info("Start");
//		Employee employee = employeeService.get(1);
//		
//	}
	
}
