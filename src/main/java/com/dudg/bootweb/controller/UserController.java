package com.dudg.bootweb.controller;

import com.dudg.bootweb.dto.BaseResult;
import com.dudg.bootweb.model.User;
import com.dudg.bootweb.service.UserService;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list")
    public String index(Model model){

        List<User> userList = userService.findAllUser();

        model.addAttribute("list",userList);
        return "user/list";
    }


    @ResponseBody
    @PostMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        if (user != null && user.getUserId() != null) {
            return userService.update(user);
        }
        return userService.addUser(user);
    }

    @ResponseBody
    @PostMapping(value = "/del")
    public BaseResult delUser(Integer id){
        return new BaseResult(userService.deleteById(id));
    }


    @ResponseBody
    @GetMapping(value = "/info")
    public BaseResult getUserById(Integer id){
        return new BaseResult(userService.selectById(id));
    }


    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}