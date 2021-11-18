package com.example.user.UserService.controller;

import com.example.user.UserService.entity.User;
import com.example.user.UserService.service.UserService;
import com.example.user.UserService.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    private User saveUser(@RequestBody User user){
        log.info("inside save method of user controller");
        return userService.saveUser(user);
    }

//    @GetMapping("/{id}")
//    private User findUserById(@PathVariable("id") Long id){
//        log.info("inside save method of user controller");
//        return userService.findUserById(id);
//    }

    @GetMapping("/{id}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable("id") Long id ){
        log.info("inside find method of user controller");
        return userService.getUserWithDepartment(id);
    }
}
