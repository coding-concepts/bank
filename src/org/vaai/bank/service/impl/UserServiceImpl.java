package org.vaai.bank.service.impl;

import org.vaai.bank.data.domain.User;
import org.vaai.bank.data.dto.RegistrationData;
import org.vaai.bank.data.dto.UserProfile;
import org.vaai.bank.service.UserService;

import java.util.HashMap;

import static org.vaai.bank.util.Utilities.makemeacake;

/**
 * Created by Bhanger Bhanger on 4/25/2018.
 */
public class UserServiceImpl implements UserService {
    public static HashMap<String, User> userStorage = new HashMap<>();


    @Override
    public UserProfile saveUser(RegistrationData data) throws Exception {
        //this is where you save......
        //takes in regdata, which has all the data for user.
        Long bakingsoda = makemeacake();
        User useme = new User();
        useme.setUserId(bakingsoda);
        useme.setEmail(data.getEmail());
        useme.setPasswd(data.getPasswd());
        useme.setUserFullName(data.getUserFullName());
        useme.setType(data.getType());
        useme.setUserName(data.getUserFullName());
        userStorage.put(data.getEmail(),useme);

        // create a new user profile and return
        UserProfile up = new UserProfile();
        up.setUserFullName(data.getUserFullName());
        up.setType(data.getType());
        return up;
    }
}
