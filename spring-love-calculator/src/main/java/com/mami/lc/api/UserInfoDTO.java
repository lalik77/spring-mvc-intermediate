package com.mami.lc.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class UserInfoDTO {

    @NotBlank(message = " * User name can't be blank")
    @Size(min = 2, message = " * Enter at least 2 symbols")
    private String userName;
    private String crushName;

    public UserInfoDTO() {
        System.out.println("Constructor Called");

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
       return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfoDTO that = (UserInfoDTO) o;
        return userName.equals(that.userName) &&
                crushName.equals(that.crushName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, crushName);
    }
}
