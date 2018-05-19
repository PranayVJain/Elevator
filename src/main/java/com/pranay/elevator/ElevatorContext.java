package com.pranay.elevator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ElevatorContext {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("elevator.xml");
		Elevator e = (Elevator)context.getBean("elevator");
		System.out.println(e.floor);
	}

}
