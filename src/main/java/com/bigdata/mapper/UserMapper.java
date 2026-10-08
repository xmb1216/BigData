package com.bigdata.mapper;

import com.bigdata.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    User selectUserByUp(@Param("uname") String uname, @Param("password") String password);
    User findByUsername(String uname);
    int insert(User user);
}
