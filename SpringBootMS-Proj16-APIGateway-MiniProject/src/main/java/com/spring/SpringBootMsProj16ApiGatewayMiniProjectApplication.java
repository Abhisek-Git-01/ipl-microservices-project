package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class SpringBootMsProj16ApiGatewayMiniProjectApplication {

	public static void main(String[] args) {
		log.debug("start of application");
		SpringApplication.run(SpringBootMsProj16ApiGatewayMiniProjectApplication.class, args);
		log.debug("end of application");
	}

}
