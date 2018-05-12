package org.vaai.bank.service;

import org.vaai.bank.data.dto.RegistrationData;

/**
 * Created by Bhanger Bhanger on 4/25/2018.
 */
public interface RegistrationValidator {
    void validate(RegistrationData data) throws Exception;
}
