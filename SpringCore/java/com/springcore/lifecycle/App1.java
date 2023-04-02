package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config4.xml");
		context.registerShutdownHook();
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		
		System.out.println("----------------------------------------------------------");
		AnnotationExample a1= (AnnotationExample) context.getBean("a1");
		System.out.println(a1);
	}
}
