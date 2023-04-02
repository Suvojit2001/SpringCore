package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config4.xml");
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config4.xml");
		Samosa s1=(Samosa) context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook(); // if we dont use AbstractapplicationContext we will
//		 not found registerShutDownHook method, this method  destroy the object
//		1) run using ApplicationContext
//		2) run using AbstractApplicationContext
//		3) now see the differencce(destroy method will call after 2nd step)
	}
}
