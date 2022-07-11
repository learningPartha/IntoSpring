package com.learnjpa.firstjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.learnjpa.firstjpa","com.learnjpa.entities","com.learnjpa.service"})
@EntityScan("com.learnjpa.entities")
@EnableJpaRepositories("com.learnjpa.service")
public class FirstjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstjpaApplication.class, args);
	}

}
