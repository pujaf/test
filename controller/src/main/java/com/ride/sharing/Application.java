package com.ride.sharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.ride.sharing.domain"})
@ComponentScan(basePackages = {"com.ride.*"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
