package com.yoshio3.billing-service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServerApplication.class, args);
    }
}
