package com.ryanjbaxter.spring.cloud.ocr.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OcrEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OcrEurekaApplication.class, args);
    }
}