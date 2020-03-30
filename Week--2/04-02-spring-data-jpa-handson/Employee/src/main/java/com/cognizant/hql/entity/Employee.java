package com.cognizant.hql.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "em_id")
	private int em_id;

	@Column(name = "em_name")
	private String em_name;

	@Column(name = "em_salary")
	private float em_salary;

	@Column(name = "em_permanent")
	private boolean em_permanent;

	@Column(name = "em_date_of_birth")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date em_date_of_birth;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "em_dp_id")
	private Department department;

	public int getEm_id() {
		return em_id;
	}

	public void setEm_id(int em_id) {
		this.em_id = em_id;
	}

	public String getEm_name() {
		return em_name;
	}

	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}

	public float getEm_salary() {
		return em_salary;
	}

	public void setEm_salary(float em_salary) {
		this.em_salary = em_salary;
	}

	public boolean isEm_permanent() {
		return em_permanent;
	}

	public void setEm_permanent(boolean em_permanent) {
		this.em_permanent = em_permanent;
	}

	public Date getEm_date_of_birth() {
		return em_date_of_birth;
	}

	public void setEm_date_of_birth(Date em_date_of_birth) {
		this.em_date_of_birth = em_date_of_birth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [em_id=" + em_id + ", em_name=" + em_name + ", em_salary=" + em_salary + ", em_permanent="
				+ em_permanent + ", em_date_of_birth=" + em_date_of_birth + ", department=" + department + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int em_id, String em_name, float em_salary, boolean em_permanent, Date em_date_of_birth,
			Department department) {
		super();
		this.em_id = em_id;
		this.em_name = em_name;
		this.em_salary = em_salary;
		this.em_permanent = em_permanent;
		this.em_date_of_birth = em_date_of_birth;
		this.department = department;
	}
	

}
