package com.telusko.student_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	 
	@Autowired
	private Service repo;
	
	@RequestMapping("/getStudents")
	public List<Student> getStudents(){
		 
		return repo.findAll();
	}

	@RequestMapping("/addStudents")
	public void addStudent(){
		Student s=new Student();
		s.setAge(1);
		s.setId(999);
		s.setName("Abdul");

		repo.save(s);
	}



}
