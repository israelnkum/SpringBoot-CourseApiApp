package com.techlineafrica.repositories;

import com.techlineafrica.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
	List<Course> findByTopicId(String topicId);
}
