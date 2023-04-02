package com.springcore.referrenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/referrenceType/config2.xml");
			Employee emp1 = (Employee) context.getBean("emp1");
			System.out.println(emp1);
		}
}
