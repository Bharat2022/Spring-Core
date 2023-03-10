package com.SpringCore.Standalone.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/Standalone/Collections/spring.cfg.xml");
        Person p1= context.getBean("p1",Person.class);
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
    }
}
