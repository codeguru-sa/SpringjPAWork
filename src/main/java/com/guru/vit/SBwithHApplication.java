package com.guru.vit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.guru.vit")
@EntityScan(basePackages ="com.guru.vit")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.guru.vit")
public class SBwithHApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBwithHApplication.class, args);
	}

}
