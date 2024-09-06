package com.groupeisi.HelloWorldBack.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldBackController {
    @GetMapping("hello")
    public String hello() {
        return "Hello World Back";
    }
}
