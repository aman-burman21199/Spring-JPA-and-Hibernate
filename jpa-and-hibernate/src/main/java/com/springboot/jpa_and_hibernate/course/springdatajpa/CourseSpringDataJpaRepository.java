package com.springboot.jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa_and_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	// we can define our own custom method following some rules
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
