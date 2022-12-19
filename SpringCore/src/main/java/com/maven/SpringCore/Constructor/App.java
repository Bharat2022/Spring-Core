package com.maven.SpringCore.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/maven/SpringCore/Constructor/spring.cfg.xml");
        Person pr1=(Person)context.getBean("person1");
        System.out.println(pr1);
        Addition ad=(Addition)context.getBean("add");
        ad.doSum();
    }
}
