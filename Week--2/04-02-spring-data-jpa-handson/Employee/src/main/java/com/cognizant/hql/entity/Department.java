package com.cognizant.hql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dp_id")
	private int dp_id;
	
	@Column(name="dp_name")
	private String dp_name;

	public int getDp_id() {
		return dp_id;
	}

	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}

	public String getDp_name() {
		return dp_name;
	}

	public void setDp_name(String dp_name) {
		this.dp_name = dp_name;
	}

	@Override
	public String toString() {
		return "Department [dp_id=" + dp_id + ", dp_name=" + dp_name + "]";
	}

	public Department(int dp_id, String dp_name) {
		super();
		this.dp_id = dp_id;
		this.dp_name = dp_name;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
