package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class AppAn {
    public static void main( String[] args ){
        ApplicationContext context= new AnnotationConfigApplicationContext(JDBCConfig.class);
        StudentDao s1= context.getBean("studentDao",StudentDao.class);
        List<Student> ls=s1.getAllStudents();
        for(Student s: ls) {
        	System.out.println(s);
        }
        
    }
}
