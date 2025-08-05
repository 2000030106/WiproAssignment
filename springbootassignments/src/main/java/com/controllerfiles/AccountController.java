package com.controllerfiles;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8088/wiproassignments/users/101/accounts?type=current&status=active

@RestController
public class AccountController {
	
	 @GetMapping("/users/{id}/accounts")
	    public List<String> getAccounts(
	            @PathVariable String id,
	            @RequestParam String type,
	            @RequestParam String status) {

	        return Arrays.asList(
	            "User ID: " + id,
	            "Account Type: " + type,
	            "Account Status: " + status
	        );
	    }

}
