package com.diogo.firstSpringApp.controller;

import com.diogo.firstSpringApp.domain.User;
import com.diogo.firstSpringApp.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;





// TESTAR REQUISOÇOES POST!!!!!!!!!!!! POSTMAN OU INSOMNIA





@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    //Posso usar '@Autowired' ao invés de fazer o construtor para passar a dependência
    @Autowired
    private HelloWorldService helloWorldService;

    //Construtor
//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    // post, get, delete, put, patch, options, head
    //responde  a requisições GET no endpoint /hello-world
    @GetMapping
    public String helloWorld() {
        return helloWorldService.sayHelloWorld("Diogo");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello " + body.getName() + "\nO email é: " + body.getEmail() + "\nId: " + id + "\nFilter: " + filter;
    }
}
