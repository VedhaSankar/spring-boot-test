package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@GetMapping
	public HashMap<String, String> sayHello() {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "apple");
		map.put("vegetable", "carrot");
		map.put("hotel", "trivago");
		return map;

}
