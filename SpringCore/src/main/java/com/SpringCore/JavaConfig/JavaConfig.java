package com.SpringCore.JavaConfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.SpringCore.JavaConfig")
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		//creating a new Student Object
		Student student = new Student(getSamosa());
		return student;
	}
}
