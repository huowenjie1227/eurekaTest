package com.huowenjie.controller;

import com.huowenjie.bean.User;
import com.huowenjie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EurekaCliController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("test01")
    public String testCli01(){
        System.out.println("=====cli01======");
        return "testCli01";
    }

    @RequestMapping("selectAll")
    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    @RequestMapping("addUser")
    public int addUser(@RequestBody User user){
        return userMapper.addUser(user);
    }

}
