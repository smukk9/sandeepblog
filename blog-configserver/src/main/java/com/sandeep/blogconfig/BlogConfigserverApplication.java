package com.sandeep.blogconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BlogConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogConfigserverApplication.class, args);
	}
}
