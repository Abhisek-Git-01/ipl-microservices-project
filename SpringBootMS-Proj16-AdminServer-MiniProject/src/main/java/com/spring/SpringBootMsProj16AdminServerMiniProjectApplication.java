package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableAdminServer
@Slf4j
public class SpringBootMsProj16AdminServerMiniProjectApplication {

	public static void main(String[] args) {
		log.debug("start of application");
		SpringApplication.run(SpringBootMsProj16AdminServerMiniProjectApplication.class, args);
		log.debug("end of application");
	}

}
