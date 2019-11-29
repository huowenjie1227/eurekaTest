package com.huowenjie.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EUREKA-CLIENT01",url = "http://localhost:8085")
public interface Test01Api {

    @RequestMapping("test01")
    public String test01();

}
