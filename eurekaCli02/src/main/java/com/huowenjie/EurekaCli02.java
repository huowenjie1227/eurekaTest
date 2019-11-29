package com.huowenjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//启用虚拟客户端
@EnableFeignClients
public class EurekaCli02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCli02.class);
    }
}
