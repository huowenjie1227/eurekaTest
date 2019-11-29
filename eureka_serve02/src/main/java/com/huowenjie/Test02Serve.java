package com.huowenjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Test02Serve {
    public static void main(String[] args) {
        SpringApplication.run(Test02Serve.class);
    }
}
