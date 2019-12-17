package com.headlines.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HeadlinesMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadlinesMsApplication.class, args);
	}

}
