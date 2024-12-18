package com.example.todo_backend.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo_backend.Model.HelloWorldBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPath(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s",name));
//		throw new RuntimeException("Something went wrong");
	}

}