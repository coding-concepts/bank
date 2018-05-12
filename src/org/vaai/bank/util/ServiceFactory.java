package org.vaai.bank.util;

import org.vaai.bank.data.domain.User;
import org.vaai.bank.service.HelloService;
import org.vaai.bank.service.RegistrationValidator;
import org.vaai.bank.service.UserService;
import org.vaai.bank.service.impl.HelloServiceImpl;
import org.vaai.bank.service.impl.RegistrationValidatorImpl;
import org.vaai.bank.service.impl.UserServiceImpl;

public class ServiceFactory {

    private static HelloService helloService = null;
    private static RegistrationValidator registrationValidator = null;
    private static UserService userService = null;

    public static HelloService getHelloService() {

        if (helloService == null){
            helloService = new HelloServiceImpl();
        }
        return helloService;
    }
    public static RegistrationValidator getRegistrationValidator() {

        if (registrationValidator == null){
            registrationValidator = new RegistrationValidatorImpl();
        }
        return registrationValidator;
    }

    public static UserService getUserService() {
        if (userService == null){
            userService = new UserServiceImpl();
        }
        return userService;
    }
}
