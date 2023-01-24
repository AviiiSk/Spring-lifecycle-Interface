package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLife {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		//life s1=(life) context.getBean("s1");
		
		// System.out.println(s1);
		
		// Registering the shutdown hook
		
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
	Cycle c1=(Cycle) context.getBean("c1");	
		
		System.out.println(c1);
		
		

	}

}
