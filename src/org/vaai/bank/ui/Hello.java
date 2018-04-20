package org.vaai.bank.ui;

import org.vaai.bank.service.HelloService;
import org.vaai.bank.util.ServiceFactory;

import javax.swing.*;

public class Hello  implements  IScreen{

    private JPanel root;
    private JLabel label;

    private HelloService helloService = ServiceFactory.getHelloService();

    public Hello () {
        label.setText(helloService.getGreeting());
    }



    @Override
    public JPanel getRootPanel() {
        return root;
    }



}
