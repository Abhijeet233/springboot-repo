package com.abhijeet.springbootwebjpa.service;

import com.abhijeet.springbootwebjpa.data.*;
import com.abhijeet.springbootwebjpa.repository.CourseMaterialrepo;
import com.abhijeet.springbootwebjpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.abhijeet.springbootwebjpa.data.courseRepo;

@Component
public class TestService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentData studentData;

    @Autowired
    CourseMaterialData courseMaterialData;
    @Autowired
    CourseMaterialrepo courseMaterialrepo;
    @Autowired
     courseRepo courseRepo;
    @Autowired
    CourseData courseData;

    @Autowired
    TeacherData teacherData;




    public void t(){
//        addStudent();
//        addcourseMaterial();
//        getCourseMaterialData();
//        addCourse();
    }

    private void addCourse() {
       courseRepo.save(courseData.getCourseData().get(0));
    }

    private void getCourseMaterialData() {
//        courseMaterialrepo.findAll().forEach(System.out::println);
    }

    private void addcourseMaterial() {
        courseMaterialrepo.save(courseMaterialData.getCourseMaterialData().get(0));
    }

    public void addStudent(){
        studentRepo.save(studentData.getStudent().get(0));
    }
}
