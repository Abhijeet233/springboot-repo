package com.example.department.DepartmentService.controller;

import com.example.department.DepartmentService.entity.Department;
import com.example.department.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDeaprtment(@RequestBody Department department){
        log.info("inside save method of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department  findDeapartmentById(@PathVariable("id") Long departmentId){
        log.info("inside find method of department controller");
        return departmentService.findDepartmentById(departmentId);
    }

}
