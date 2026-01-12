package com.teluskoLearning.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.teluskoLearning.demo")
public class SpringBootWeb1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeb1Application.class, args);
	}

}
