package com.bigdata.service.Impl;

import com.bigdata.entity.User;
import com.bigdata.mapper.UserMapper;
import com.bigdata.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String uname, String password) {
        return userMapper.selectUserByUp(uname, password);
    }
    @Override
    public int register(String uname, String password) {
        // 1. 先校验用户名是否已存在
        User existUser = userMapper.findByUsername(uname);
        if (existUser != null) {
            return 2; // 2 = 用户名已存在
        }
        // 2. 用户名可用，执行插入
        User user = new User();
        user.setUname(uname);
        user.setPassword(password);
        int rows = userMapper.insert(user);

        return rows > 0 ? 1 : 0; // 1 = 注册成功，0 = 注册失败
    }
}