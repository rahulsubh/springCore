package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		Samosa s1 = context.getBean("samosa",Samosa.class);
		System.out.println(s1);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Pepsi p  = context.getBean("p1",Pepsi.class);
		System.out.println(p);
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Example example = context.getBean("e1",Example.class);
		System.out.println(example);

	}

}
