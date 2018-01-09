package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		//Load the config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope.xml");
		
		
		//Load the beans from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean results = (theCoach==alphaCoach);
		
		
		System.out.println("\n Pointing to the same object: "+ results);
		
		System.out.println("\n theCoach memory location: "+ theCoach  );
		
		System.out.println("\n alphaCoach memory location: "+ alphaCoach );
		
		
	}

}
