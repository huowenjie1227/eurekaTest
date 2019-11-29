package com.huowenjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Test01Serce {
    public static void main(String[] args) {
        SpringApplication.run(Test01Serce.class);
    }
}
