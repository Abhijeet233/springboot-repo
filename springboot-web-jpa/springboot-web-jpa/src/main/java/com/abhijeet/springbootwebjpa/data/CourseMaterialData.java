package com.abhijeet.springbootwebjpa.data;

import com.abhijeet.springbootwebjpa.entity.Course;
import com.abhijeet.springbootwebjpa.entity.CourseMaterial;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CourseMaterialData {
    public List<CourseMaterial> getCourseMaterialData(){
        return Arrays.asList(
                CourseMaterial.builder().url("c1.com").course(
                        Course.builder().courseTitle("DSA").credit(3).build()
                ).build()
        );
    }
}
