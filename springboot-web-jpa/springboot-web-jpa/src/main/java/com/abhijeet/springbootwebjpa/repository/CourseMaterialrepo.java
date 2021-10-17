package com.abhijeet.springbootwebjpa.repository;

import com.abhijeet.springbootwebjpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialrepo extends JpaRepository<CourseMaterial, Long> {
}
