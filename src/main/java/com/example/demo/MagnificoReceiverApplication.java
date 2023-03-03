package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MagnificoReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagnificoReceiverApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello World!";
	}

	@RequestMapping("/trade")
	String getTrade() {
		return "Trade 1234";
	}
}
