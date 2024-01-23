package com.gaurang.SpringJDBCEx.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gaurang.SpringJDBCEx.model.Student;

@Repository
public class StudentRepository {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Student s) {
		String sql = "insert into student (rollno,name,marks) values(?,?,?)";
		int update = jdbcTemplate.update(sql,s.getRollNo(),s.getName(),s.getMarks());
		System.out.println(update + " effected...");
	}
	
	public List<Student> findAll() {

		String sql = "select * from student";
		
		RowMapper<Student> mapper = (rs, rowNum) -> {
				Student s = new Student();
				s.setRollNo(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setMarks(rs.getInt("marks"));
				
				return s;
		};
		return jdbcTemplate.query(sql, mapper);
	}
}
