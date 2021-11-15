package com.example.user.UserService.service;

import com.example.user.UserService.entity.User;
import com.example.user.UserService.repository.UserRepository;
import com.example.user.UserService.vo.Department;
import com.example.user.UserService.vo.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findUserByUserId(id);
    }

    public ResponseTemplateVo getUserWithDepartment(Long id) {

        User user = userRepository.findUserByUserId(id);
        return new ResponseTemplateVo(
                user,
                restTemplate.getForObject("http://localhost:9001/department/" + user.getDepartmentId(),
                        Department.class)
        );
    }
}
