package com.huowenjie.controller;

import com.huowenjie.api.Test01Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCliController {

    @Autowired
    private Test01Api test01Api;

    @RequestMapping("test02")
    public String testclient02(){
        String test01 = test01Api.test01();
        System.out.println("====testcli02===");
        return test01;
    }

}
