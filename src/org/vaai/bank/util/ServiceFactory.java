package org.vaai.bank.util;

import org.vaai.bank.service.HelloService;
import org.vaai.bank.service.impl.HelloServiceImpl;

public class ServiceFactory {

    private static HelloService helloService = null;


    public static HelloService getHelloService() {

        if (helloService == null){
            helloService = new HelloServiceImpl();
        }
        return helloService;
    }
}
