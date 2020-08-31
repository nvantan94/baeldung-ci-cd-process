package com.tannv.springcicdsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCiCdSampleApplication {

	public static void main(String[] args) {
		System.out.println("start Spring application");
		SpringApplication.run(SpringCiCdSampleApplication.class, args);
	}

}
