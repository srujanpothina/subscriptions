package com.subscription.service;

import org.springframework.stereotype.Service;
import com.subscription.model.HelloWorldResponse;

@Service
public class HelloWorldService {
    public HelloWorldResponse getHelloWorld() {
        return new HelloWorldResponse("Hello, World!");
    }
}
