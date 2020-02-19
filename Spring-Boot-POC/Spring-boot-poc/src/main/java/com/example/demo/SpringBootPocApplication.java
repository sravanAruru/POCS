package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
@ComponentScan({"com.nisum"})
@EnableWebMvc
@PropertySource("classpath:application.properties")
public class SpringBootPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPocApplication.class, args);
	}
}
