package org.vaai.bank.application;

import org.vaai.bank.util.UiFactory;

import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args){
        JFrame f = new JFrame("My App");
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setContentPane(UiFactory.getHelloScreen().getRootPanel());
        f.setVisible(Boolean.TRUE);
    }
}
