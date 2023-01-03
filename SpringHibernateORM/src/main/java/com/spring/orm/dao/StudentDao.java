package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	@Transactional
	public int insert(Student student) {
		return (Integer)this.ht.save(student);
	}
	public Student getStudent(int studentId) {
		return this.ht.get(Student.class,studentId);
	}
	public List<Student> getAllStudent() {
		return this.ht.loadAll(Student.class);
	}
	@Transactional
	public void delete(int studentId) {
		this.ht.delete(ht.get(Student.class, studentId));
	}
	@Transactional
	public void update(Student student) {
		this.ht.update(student);
	}
	
}
