package com.example.demo.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao dao;

    @Override
    public List<Map<String, Object>> all() {
        return dao.all();
    }

    @Override
    public UserEntity one(Integer uid) {
        return dao.one(uid);
    }
}
