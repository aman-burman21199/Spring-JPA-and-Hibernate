package com.springboot.jpa_and_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa_and_hibernate.course.Course;

@Component
public class CourseSpringDataJpaRunner implements CommandLineRunner {
	
	@Autowired
	private CourseSpringDataJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(1,"Learn JPA","Aman"));
		repo.save(new Course(2,"Learn JDBC","Aman"));
		// Below methods are offered by SpringDataJpaRepository and accept long datatype
		repo.deleteById(1l);
		System.out.println(repo.findById(2l));
		System.out.println(repo.findAll());
		System.out.println(repo.count());
		System.out.println(repo.findByAuthor("Aman"));
	}
	
	

}
