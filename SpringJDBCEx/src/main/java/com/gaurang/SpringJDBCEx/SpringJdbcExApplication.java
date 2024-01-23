package com.gaurang.SpringJDBCEx;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.gaurang.SpringJDBCEx.model.Student;
import com.gaurang.SpringJDBCEx.service.StudentService;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setRollNo(1);
		student.setName("Gaurang");
		student.setMarks(95);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(student);
		
		List<Student> students = service.getStudents();
		
		System.out.println(students);
		
	}

}
