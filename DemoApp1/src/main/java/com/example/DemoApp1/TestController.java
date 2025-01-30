package com.example.DemoApp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hello from app 1";
    }

    @GetMapping("/sayNamaste")
    public String sayNamaste()
    {
        return "Namaste from app 1";
    }


}
