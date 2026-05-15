package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@RefreshScope
public class SpringBootMsProj16IplPlayerServiceMiniProjectApplication {

	public static void main(String[] args) {
		log.debug("start of application");
		SpringApplication.run(SpringBootMsProj16IplPlayerServiceMiniProjectApplication.class, args);
		log.debug("end of application");
	}

}
