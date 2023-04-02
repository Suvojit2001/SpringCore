package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Apps {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/config1.xml");
    Emp emp1=(Emp)context.getBean("emp1");
    System.out.println(emp1);
}
}
