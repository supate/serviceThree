package com.spatel.springboot.servicethree;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceThreeController {

	
	@PostMapping("/hello")
	public String sayHello(@RequestBody FullName fullName) {
		return fullName.getName() + " " + fullName.getSurName();
	}
}
