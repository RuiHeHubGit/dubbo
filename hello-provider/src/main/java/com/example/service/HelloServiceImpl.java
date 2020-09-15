package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloService;

@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
