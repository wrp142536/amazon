package com.gao.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonApplication {

	public static void main(String[] args) {
		System.out.println("AmazonApplication.main()");
		SpringApplication.run(AmazonApplication.class, args);
	}
}
