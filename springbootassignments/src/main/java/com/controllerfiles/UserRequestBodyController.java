package com.controllerfiles;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprograms.UserRequest;

@RestController
@RequestMapping("/users")
public class UserRequestBodyController {

	 @PostMapping
	    public String createUser(@RequestBody UserRequest user) {
	        return "User created: " + user.getFirstname() + " " + user.getLastname() + ", Age: " + user.getAge();
	    } 
	 
}
