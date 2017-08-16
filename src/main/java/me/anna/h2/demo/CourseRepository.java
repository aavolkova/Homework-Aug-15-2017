package me.anna.h2.demo;

import me.anna.h2.demo.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}