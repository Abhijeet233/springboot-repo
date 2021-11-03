package com.abhijeet.springbootwebjpa.data;


import com.abhijeet.springbootwebjpa.entity.Course;
import com.abhijeet.springbootwebjpa.entity.CourseMaterial;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CourseData {

    public List<Course> getCourseData(){
        return Arrays.asList(
               Course.builder()
                       .courseTitle("MATLAB")
                       .credit(4)
                       .courseMaterial(
                               CourseMaterial.builder().url("c2").build()
                       )
                       .build()
        );
    }
}
