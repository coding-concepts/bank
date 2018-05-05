package org.vaai.bank.service;

import org.vaai.bank.data.dto.RegistrationData;
import org.vaai.bank.data.dto.UserProfile;

/**
 * Created by Bhanger Bhanger on 4/25/2018.
 */
public interface UserService {
    UserProfile saveUser(RegistrationData data) throws Exception;


}
