package com.cognizant.hql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class Skill {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sk_id")
	private int sk_id;
	
	
	@Column(name="sk_name")
	private String sk_name;


	public int getSk_id() {
		return sk_id;
	}


	public void setSk_id(int sk_id) {
		this.sk_id = sk_id;
	}


	public String getSk_name() {
		return sk_name;
	}


	public void setSk_name(String sk_name) {
		this.sk_name = sk_name;
	}


	@Override
	public String toString() {
		return "Skill [sk_id=" + sk_id + ", sk_name=" + sk_name + "]";
	}


	public Skill(int sk_id, String sk_name) {
		super();
		this.sk_id = sk_id;
		this.sk_name = sk_name;
	}


	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
