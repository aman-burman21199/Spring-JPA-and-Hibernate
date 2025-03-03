package com.springboot.jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.springboot.jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
// Transactional is needed whenever we want to execute queries using jpa
class CourseJpaRepository {
	
	// More specific than @Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
