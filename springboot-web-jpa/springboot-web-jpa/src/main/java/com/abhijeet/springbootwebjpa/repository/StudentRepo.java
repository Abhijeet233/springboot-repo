package com.abhijeet.springbootwebjpa.repository;

import com.abhijeet.springbootwebjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
