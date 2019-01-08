package com.springboot.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {

    @Autowired
    private HelloServiceClient helloServiceClient;

    @RequestMapping(value = "/say-hello", method = RequestMethod.GET)
    public String sayHello() {
        return helloServiceClient.sayHello();
    }

}
