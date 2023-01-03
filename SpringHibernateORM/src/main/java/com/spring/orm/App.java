package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
    public static void main( String[] args ){
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/orm/SpringOrm.cfg.xml");
    	StudentDao sd= context.getBean("studentDao",StudentDao.class);
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("******************************Welcome to Spring ORM Project******************************");
    	boolean go=true;
    	while(go) {
    		System.out.print("1. Insertion\n2. Single Record\n3. All Records\n4. Deletion\n5. Updation\n6. Exit\n\nChoose your Option : ");
    		try {
    			int input=Integer.parseInt(br.readLine());
    			switch (input) {
				case 1:
					System.out.print("Enter user id : ");
					int uId=Integer.parseInt(br.readLine());
					
					System.out.print("Enter user name : ");
					String uName=br.readLine();
					
					System.out.print("Enter user city : ");
					String uCity=br.readLine();
					
					Student s = new Student();
					s.setStudentId(uId);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					
					int r=sd.insert(s);
					System.out.println("\n"+r+" Student Added");
					System.out.println("************************************************************\n");
					break;
				case 2:
					System.out.print("Enter user id : ");
					int userId=Integer.parseInt(br.readLine());
					Student std=sd.getStudent(userId);
					System.out.println("\n"+std.getStudentId()+" "+std.getStudentName()+" "+std.getStudentCity());
					System.out.println("************************************************************\n");
					break;
				case 3:
					List<Student> allStudents=sd.getAllStudent();
					for(Student st: allStudents)
						System.out.println(st.getStudentId()+" "+st.getStudentName()+" "+st.getStudentCity());
					System.out.println("************************************************************\n");
					break;
				case 4:
					System.out.print("Enter user id : ");
					int Id=Integer.parseInt(br.readLine());
					sd.delete(Id);
					System.out.println("Record Deleted !!! ");
					System.out.println("************************************************************\n");
					break;
				case 5:
					System.out.print("Enter user id : ");
					int usId=Integer.parseInt(br.readLine());
					Student stu=sd.getStudent(usId);
					System.out.print("Enter user name : ");
					String usName=br.readLine();
					
					System.out.print("Enter user city : ");
					String usCity=br.readLine();
					
					stu.setStudentName(usName);
					stu.setStudentCity(usCity);
					sd.update(stu);
					System.out.println("Record Updated !!!");
					System.out.println("************************************************************\n");
					break;
				case 6:
					go=false;
					break;
				default:
					System.out.println("Invaild Input !!!\n");
					break;
				}
    		}catch (Exception e) {
				System.out.println("Invaild Input Try with another one !!!");
				System.out.println(e.getMessage()+"\n");
			}
    	}
    	System.out.println("Thankyou using my application\nSee you soon !!");
    }
}
