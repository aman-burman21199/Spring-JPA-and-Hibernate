package com.springboot.jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa_and_hibernate.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.insert(new Course(1,"Learn JPA","Aman"));
		repo.insert(new Course(2,"Learn JDBC","Aman"));
		repo.deleteById(1);
		System.out.println(repo.findById(2));
	}
	
	

}
