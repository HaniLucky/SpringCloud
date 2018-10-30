package com.covet.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCopyApplication.class, args);
	}
}
