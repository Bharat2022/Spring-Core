package com.maven.SpringCore.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/maven/SpringCore/Reference/spring.cfg.xml");
		A obj1=(A)context.getBean("Aref1");
		System.out.println(obj1.getX());
		System.out.println(obj1.getOb().getY());
		System.out.println(obj1);
	}
}
