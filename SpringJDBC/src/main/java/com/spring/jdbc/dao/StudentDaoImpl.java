package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;


@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		String query="insert into student(id,name,city) values(?,?,?)";
		return this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	}
	@Override
	public int update(Student student) {
		String query="update student set name=?, city=? where id =?";
		return this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	}
	@Override
	public int delete(int studentId) {
		String query="delete from student where id=?";
		return this.jdbcTemplate.update(query,studentId);
	}
	@Override
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	
//	@Override
//	public Student getStudent(int studentId) {
//		String query="select * from student where id=?";
//		Student student=this.jdbcTemplate.queryForObject(query,new RowMapper<Student>() {
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student student = new Student();
//				student.setId(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//				return student;
//			}
//		
//		} ,studentId);
//		return student;
//	}
	@Override
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> list=this.jdbcTemplate.query(query, new RowMapperImpl());
		return list;
	}

}
