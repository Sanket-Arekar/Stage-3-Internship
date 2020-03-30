package com.cognizant.hql.entity;

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

@Entity
@Table(name="employee_skill")
public class EmployeeSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "es_id")
	private int es_id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "em_id")
    private Employee employee;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "sk_id")
    private Skill skill;

	public int getEs_id() {
		return es_id;
	}

	public void setEs_id(int es_id) {
		this.es_id = es_id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "EmployeeSkill [es_id=" + es_id + ", employee=" + employee + ", skill=" + skill + "]";
	}

	public EmployeeSkill(int es_id, Employee employee, Skill skill) {
		super();
		this.es_id = es_id;
		this.employee = employee;
		this.skill = skill;
	}

	public EmployeeSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
