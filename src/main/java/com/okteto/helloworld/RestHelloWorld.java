package com.okteto.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloWorld {
	
	@GetMapping("/")
	public String sayHello() {
		return "222222222222222222222";
	}
}
