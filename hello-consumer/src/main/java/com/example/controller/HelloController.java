package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping("hello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }
}
