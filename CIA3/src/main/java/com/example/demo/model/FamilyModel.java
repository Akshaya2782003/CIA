package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FamilyModel 
{
	@Id
	private String name;
	private int age;
	private String relation;
	public FamilyModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FamilyModel(String name, int age, String relation) {
		super();
		this.name = name;
		this.age = age;
		this.relation = relation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
}