package com.huowenjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCliApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCliApp.class);
    }
}
