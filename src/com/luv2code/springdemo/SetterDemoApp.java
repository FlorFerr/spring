package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring container
				
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());		
		System.out.println(theCoach.getDailyFortune());

		// literal values
		System.out.println(theCoach.getEmailAddress());	
		System.out.println(theCoach.getTeam());	
		
		
		//Close the context
		context.close();
	}

}
