package com.dudg.bootweb.mapper;

import com.dudg.bootweb.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAllUser();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}