package com.dudg.bootweb.service;

import com.dudg.bootweb.model.User;

import java.util.List;

/**
 * @interface: UserService
 * @description: 用户业务接口
 * @author: dudg
 * @create: 2019-07-24 15:22
 */
public interface UserService {

    int addUser(User user);

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    List<User> findAllUser(int pageNum, int pageSize);

    List<User> findAllUser();

}

