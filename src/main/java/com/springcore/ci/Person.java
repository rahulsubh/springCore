package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int studentId;
	private Certi certi;
	private List<String> subjects;
	
	public Person(String name, int studentId, Certi certi, List<String> subjects) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.certi = certi;
		this.subjects = subjects;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", studentId=" + studentId + ", certi=" + certi + ", subjects=" + subjects
				+ "]";
	}
	
	
	
	
	
	
	
	

}
