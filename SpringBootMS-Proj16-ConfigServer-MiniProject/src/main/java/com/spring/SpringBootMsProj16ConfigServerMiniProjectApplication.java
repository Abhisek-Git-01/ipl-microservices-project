package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class SpringBootMsProj16ConfigServerMiniProjectApplication {

	public static void main(String[] args) {
		log.debug("start of application");
		SpringApplication.run(SpringBootMsProj16ConfigServerMiniProjectApplication.class, args);
		log.debug("end of application");
	}

}
