package org.vaai.bank.service.impl;

import org.vaai.bank.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String getGreeting() {
        return "Hello There";
    }
}
