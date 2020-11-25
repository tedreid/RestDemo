package com.tedreid.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwesomeController {

	@GetMapping("/say_hello")
	public String sayHello(@RequestParam(value = "name", defaultValue = "John Jacob Jingleheimer Schmidt") String name){
		AwesomeService service = new AwesomeService(1, name);
		return service.SayHelloToMyLittleFriend();
	}
	
}
