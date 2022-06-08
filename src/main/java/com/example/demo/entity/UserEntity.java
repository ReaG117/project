package com.example.demo.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Integer uid;
    private String username;
    private String userpwd;
    public Integer getUid() {
        return uid;
    }
    public String getUserpwd() {
        return userpwd;
    }
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    
}
