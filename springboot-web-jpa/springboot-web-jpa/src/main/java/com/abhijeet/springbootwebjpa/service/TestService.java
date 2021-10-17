package com.abhijeet.springbootwebjpa.service;

import com.abhijeet.springbootwebjpa.data.StudentData;
import com.abhijeet.springbootwebjpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    StudentRepo studentRepo;
    @Autowired
    StudentData studentData;

    public void t(){
        addStudent();
    }

    public void addStudent(){
        studentRepo.save(studentData.getStudent().get(0));
    }
}
