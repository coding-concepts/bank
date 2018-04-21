package org.vaai.bank.data.dto;

import org.vaai.bank.enums.UserType;

public class UserProfile {

    private String userFullName;
    private UserType type;

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserProfile{");
        sb.append("userFullName='").append(userFullName).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
