package com.example.user.UserService.vo;

import com.example.user.UserService.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

    private User user;
    private Department department;
}
