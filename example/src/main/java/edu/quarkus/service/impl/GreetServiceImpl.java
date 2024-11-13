package edu.quarkus.service.impl;

import edu.quarkus.service.GreetService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetServiceImpl implements GreetService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
