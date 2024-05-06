package com.mic.Swag.Ui;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
  
    public String welcome( String name) {
        return "Welcome " + name;
    }
}
