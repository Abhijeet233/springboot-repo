package com.example.APIGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class FallbackMethodController {
    @GetMapping("userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "USER SERVICE DOWN";
    }

    @GetMapping("departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "Department SERVICE DOWN";
    }
}
