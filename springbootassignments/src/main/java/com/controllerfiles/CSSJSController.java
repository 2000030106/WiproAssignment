package com.controllerfiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CSSJSController {

	@GetMapping("/home")
    public String loadHomePage() {
        return "home";  
    }
}
