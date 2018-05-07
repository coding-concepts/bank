package org.vaai.bank.util;

import org.vaai.bank.ui.Hello;
import org.vaai.bank.ui.IScreen;

public class UiFactory {

    private static IScreen hello = null;

    public static IScreen getHelloScreen() {
        if (hello == null){
            hello = new Hello();
        }
        return hello;
    }
}
