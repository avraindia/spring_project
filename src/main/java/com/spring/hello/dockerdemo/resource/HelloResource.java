package com.spring.hello.dockerdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello/world")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello World";
    }
}
