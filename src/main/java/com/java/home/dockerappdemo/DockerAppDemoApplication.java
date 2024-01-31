package com.java.home.dockerappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/service")
public class DockerAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerAppDemoApplication.class, args);
	}

	@GetMapping("/show")
	public String publish(){
		return "my first published application..........";
	}

}
