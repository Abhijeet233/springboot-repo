package com.abhijeet.springbootwebjpa.service;

import com.abhijeet.springbootwebjpa.data.CourseMaterialData;
import com.abhijeet.springbootwebjpa.data.StudentData;
import com.abhijeet.springbootwebjpa.entity.CourseMaterial;
import com.abhijeet.springbootwebjpa.repository.CourseMaterialrepo;
import com.abhijeet.springbootwebjpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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



    public void t(){
//        addStudent();
//        addcourseMaterial();
        getCourseMaterialData();
    }

    private void getCourseMaterialData() {
        courseMaterialrepo.findAll().stream().forEach(x -> System.out.println(x));
    }

    private void addcourseMaterial() {
        courseMaterialrepo.save(courseMaterialData.getCourseMaterialData().get(0));
    }

    public void addStudent(){
        studentRepo.save(studentData.getStudent().get(0));
    }
}
