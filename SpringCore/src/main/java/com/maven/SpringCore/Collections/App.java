package com.maven.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/maven/SpringCore/Collections/spring.cfg.xml");
        Emp emp1= context.getBean("emp1",Emp.class);
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getPhones().getClass().getName());
    }
}
