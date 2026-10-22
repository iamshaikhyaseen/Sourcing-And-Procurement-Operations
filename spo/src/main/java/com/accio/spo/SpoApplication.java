package com.accio.spo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpoApplication.class, args);
	}

}
