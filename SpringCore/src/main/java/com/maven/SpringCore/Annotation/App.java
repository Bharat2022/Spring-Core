package com.maven.SpringCore.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/maven/SpringCore/Annotation/spring.cfg.xml");
        Emp emp1= context.getBean("emp1",Emp.class);
        System.out.println(emp1);
    }
}
