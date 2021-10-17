package com.abhijeet.springbootwebjpa.data;

import com.abhijeet.springbootwebjpa.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentData {


    public List<Student> getStudent() {
        return Arrays.asList(
                Student.builder().studentId(1L).emailId("a1@a.com").firstName("a1").lastname("a1").build()
        );
    }
}
