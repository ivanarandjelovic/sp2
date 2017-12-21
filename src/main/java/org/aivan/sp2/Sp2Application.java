package org.aivan.sp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Sp2Application {
	public static void main(String[] args) {
		SpringApplication.run(Sp2Application.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "Hi from Sp2!";
	}
}
