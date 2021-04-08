package com.jakebakewell.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloHumanController {
	@RequestMapping("")
	public String helloHuman(@RequestParam(value="firstName", required=false, defaultValue="Human") String firstName, @RequestParam(value="lastName", required=false, defaultValue="") String lastName) {
		return "Hello " + firstName + " " + lastName + "!";
	}
}
