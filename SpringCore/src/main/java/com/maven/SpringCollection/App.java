package com.maven.SpringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/maven/SpringCollection/spring.cfg.xml");
		Employee emp1=(Employee)context.getBean("Emp1");
		System.out.println("Name : "+emp1.getEmpName());
		System.out.println("Phone no. :"+emp1.getPhones());
		System.out.println("Addresses :"+emp1.getAddress());
		System.out.println("Courses :"+emp1.getCourses());
	}
}
