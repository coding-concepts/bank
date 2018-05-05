package org.vaai.bank.service.impl;

import org.vaai.bank.data.domain.User;
import org.vaai.bank.data.dto.RegistrationData;
import org.vaai.bank.data.dto.UserProfile;
import org.vaai.bank.service.UserService;

import java.util.HashMap;

/**
 * Created by Bhanger Bhanger on 4/25/2018.
 */
public class UserServiceImpl implements UserService {
    public static HashMap<String, User> userStorage = new HashMap<>();

    @Override
    public UserProfile saveUser(RegistrationData data) throws Exception {
        //this is where you save......

        UserProfile up = new UserProfile();
        up.setUserFullName(data.getUserFullName());
        up.setType(data.getType());

        return up;
    }
}
