package com.bigdata.service;
import com.bigdata.entity.User;

public interface UserService {
    User login(String uname, String password);
    int register(String uname,String password);
}