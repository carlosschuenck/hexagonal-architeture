package com.customer.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan(basePackages = { "com.customer" })
@ComponentScan(basePackages = { "com.customer" })
@EnableJpaRepositories(basePackages = { "com.customer" })
@EnableTransactionManagement
@SpringBootApplication
public class CustomerApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApiApplication.class, args);
	}
}
