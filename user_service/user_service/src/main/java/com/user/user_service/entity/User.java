package com.user.user_service.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User  {
    private Long userId;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();


    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public User(Long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }
}
