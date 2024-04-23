package com.lanhaomin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAdminServer
@Configuration
@EnableAutoConfiguration
public class AdminServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }


}
