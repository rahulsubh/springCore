package com.springcore.standalone.collections;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		Person p = context.getBean("p1",Person.class);
		System.out.println(p);

	}

}
