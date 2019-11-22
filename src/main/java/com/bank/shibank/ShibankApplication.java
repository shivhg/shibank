package com.bank.shibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShibankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShibankApplication.class, args);
	}

}
