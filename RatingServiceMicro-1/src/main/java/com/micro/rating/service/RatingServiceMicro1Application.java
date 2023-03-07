package com.micro.rating.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingServiceMicro1Application {

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceMicro1Application.class, args);
	}

}
