package com.maven.SpringCore.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/maven/SpringCore/LifeCycle/spring.cfg.xml");
        System.out.println("------------------------------------------");
    	Samosa s1=(Samosa)context.getBean("samosa1");
        System.out.println(s1);
        System.out.println("------------------------------------------");
        Pepsi p1=(Pepsi)context.getBean("p1");
        System.out.println(p1);
        System.out.println("------------------------------------------");
        Pizza pz1=(Pizza)context.getBean("pz1");
        System.out.println(pz1);
        System.out.println("------------------------------------------");
        context.registerShutdownHook();
    }
}
