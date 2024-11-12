package com.diogo.firstSpringApp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String sayHelloWorld(String name) {
        return "Hello " + name;
    }
}
