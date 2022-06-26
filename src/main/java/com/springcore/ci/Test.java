package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		Person p1 = context.getBean("person",Person.class);
		System.out.println(p1);
		
		System.out.println("--------------------------------------------");
		
		Addition addition = context.getBean("add",Addition.class);
		
		System.out.println(addition.getA());
		System.out.println(addition.getB());
		
		addition.dSum();
	}

}
