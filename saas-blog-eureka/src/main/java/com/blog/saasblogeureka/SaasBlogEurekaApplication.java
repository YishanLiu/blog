package com.blog.saasblogeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SaasBlogEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaasBlogEurekaApplication.class, args);
    }

}
