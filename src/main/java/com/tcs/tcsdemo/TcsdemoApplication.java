package com.tcs.tcsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TcsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsdemoApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "<h1>Welcome to TCS Demo Application</h1>";
	}

	@GetMapping("/greeting")
	public String greeting() {
		return "<h1>This is from the greetings page</h1>";
	}
}
