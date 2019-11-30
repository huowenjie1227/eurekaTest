package com.huowenjie.api;

import com.huowenjie.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "EUREKA-CLIENT01",url = "http://localhost:8085")
public interface Test01Api {

    @RequestMapping("test01")
    public String test01();

    @RequestMapping("selectAll")
    public List<User> selectAll();

    @RequestMapping("addUser")
    public int addUser(@RequestBody User user);


}
