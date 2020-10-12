package com.skull.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Main class for resource server.
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-10-11
 *
 */
@SpringBootApplication
@EnableResourceServer
public class MpmSrvResourceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MpmSrvResourceApplication.class, args);
	}

}
