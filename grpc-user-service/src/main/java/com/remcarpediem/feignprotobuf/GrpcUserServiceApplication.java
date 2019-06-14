package com.remcarpediem.feignprotobuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GrpcUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcUserServiceApplication.class, args);
    }
}
