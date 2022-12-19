package com.SpringCore.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	   public static void main( String[] args ){
	        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
	        Student s1= context.getBean("student",Student.class);
	        s1.study();
	        
	    }
}
