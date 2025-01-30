package com.example.DemoApp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hello from app 2";
    }

    @GetMapping("/sayKonichiwa")
    public String sayAdios()
    {
        return "Konichiwa from app 2";
    }
}
