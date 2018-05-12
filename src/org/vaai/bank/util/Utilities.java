package org.vaai.bank.util;

import java.util.Random;

import static org.vaai.bank.service.impl.UserServiceImpl.userStorage;

public class Utilities {

    public static Long makemeacake() {

        //50 is the maximum and the 1 is our minimum
        Random rand = new Random();
        Long n = rand.nextLong();
        while (userStorage.containsKey(n)) {
            n = rand.nextLong();
        }
        System.out.println(n);
        return n;
    }
}
