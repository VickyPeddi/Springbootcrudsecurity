package com.example.springjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjwt.controller.Homecontroller;

@SpringBootApplication
public class SpringJwtApplication
//        implements CommandLineRunner
{
	@Autowired
	public Homecontroller homecontroller;

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}

}
