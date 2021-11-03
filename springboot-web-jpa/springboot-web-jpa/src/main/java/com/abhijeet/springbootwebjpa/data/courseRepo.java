package com.abhijeet.springbootwebjpa.data;

import com.abhijeet.springbootwebjpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepo extends JpaRepository<Course, Long> {
}
