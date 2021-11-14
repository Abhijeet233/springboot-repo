package com.example.user.UserService.service;

import com.example.user.UserService.entity.User;
import com.example.user.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User findUserById(Long id){
        return userRepository.findUserById(id);
    }

}
