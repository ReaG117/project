package com.example.demo.dao;

import com.example.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<Map<String,Object>> all();
    UserEntity one(Integer uid);
}
