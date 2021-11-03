package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    List<User> l1= List.of(
          new User(1L,"a","99999999"),
          new User(2L,"b","89999999"),
          new User(3L,"c","79999999")
    );
    @Override
    public User getUser(Long id) {
         return l1.stream().filter(u->u.getUserId().equals(id)).findAny().orElse(null);
    }
}
