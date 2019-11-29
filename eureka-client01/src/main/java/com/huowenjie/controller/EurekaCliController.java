package com.huowenjie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaCliController {

    @RequestMapping("test01")
    public String testCli01(){
        System.out.println("=====cli01======");
        return "testCli01";
    }

}
