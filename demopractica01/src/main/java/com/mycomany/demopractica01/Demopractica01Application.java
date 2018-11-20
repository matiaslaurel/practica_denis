package com.mycomany.demopractica01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.mycompany.repository")
@ComponentScan({"com.mycompany.controller","com.mycompany.service"})
@EntityScan("com.mycompany.modell")
public class Demopractica01Application {

	public static void main(String[] args) {
		SpringApplication.run(Demopractica01Application.class, args);
	}
}
