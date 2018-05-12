package org.vaai.bank.service.impl;

import org.vaai.bank.data.dto.RegistrationData;
import org.vaai.bank.service.RegistrationValidator;

/**
 * Created by Bhanger Bhanger on 4/25/2018.
 */
public class RegistrationValidatorImpl implements RegistrationValidator {
    @Override

    public void validate(RegistrationData data) throws Exception {


        if (data.getEmail() == null || "".equals(data.getEmail())){
            throw new Exception("Email can't be null");
        }
        if(data.getUserFullName() == null  ){
            throw new Exception("Name can't be null");
        }
        if (data.getPasswd().length() < 8){
            throw new Exception("Passwd needs to be more than 8 chars");
        }
        if (data.getConfirmPasswd().length() < 8 ){
            throw new Exception("Passwd needs to be more than 8 chars");
        }else if(!data.getConfirmPasswd().equals(data.getPasswd()) ){
            throw new Exception("Passwds need 2 be the same");
        }
        if (data.getType() == null){
            throw new Exception("select a type ");
        }
    }
}
