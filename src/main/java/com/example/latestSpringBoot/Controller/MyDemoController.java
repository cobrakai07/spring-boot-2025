package com.example.latestSpringBoot.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyDemoController {
    @GetMapping("/get")
    public String getFunction(){
        return "Hi";
    }
    @GetMapping("/bye")
    public String getByeFunction(){
        return "bye";
    }
}
