package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main( String[] args ){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/Spring.cfg.xml");
        StudentDao s1= context.getBean("studentDao",StudentDao.class);
        
//		Inserted
//        
//        Student student = new Student(); 
//        student.setId(103);
//        student.setName("Raj");
//        student.setCity("lucknow");
//        int result= s1.insert(student);
//        System.out.println("no.s of record inserted : "+result );
        
//     Updated
//        Student student = new Student();
//        student.setId(102);
//        student.setName("Raj");
//        student.setCity("Lucknow");
//        int result= s1.update(student);
//        System.out.println("no.s of record Updated : "+result );
        
//     Deleted
//        int result= s1.delete(102);
//        System.out.println("no.s of record Deleted : "+result );
        
//	   Fetch single record
//        Student student=s1.getStudent(101);
//        System.out.println(student);
        
//	   Fetch All records
        List<Student> ls=s1.getAllStudents();
        for(Student s: ls) {
        	System.out.println(s);
        }
        
    }
}
