package com.wemb.renobit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wemb.renobit")
public class RenobitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenobitApplication.class, args);
	}

}
