package com.spring.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/")
    public String hello(){

        return "Hi welocome";

    }

    @GetMapping("/hello")
    public String hello1(){
        return "Hi welocom1e test";
    }
}
