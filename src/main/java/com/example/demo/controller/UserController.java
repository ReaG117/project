package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(originPatterns = "*",methods = {RequestMethod.POST,RequestMethod.GET})
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/all")
    public List<Map<String, Object>> all(){
        return userService.all();
    }

    @GetMapping(value = "/{uid}")
    public String one(@PathVariable Integer uid){
        try {
            return userService.one(uid).toString();
        }catch (Exception e){
            return null;
        }

    }
}
