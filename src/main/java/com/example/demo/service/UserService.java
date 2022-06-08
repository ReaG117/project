package com.example.demo.service;

import com.example.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Map<String,Object>> all();

    UserEntity one(Integer uid);
}
