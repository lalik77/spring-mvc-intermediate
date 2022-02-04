package com.mami.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class UserInfoDTO {

    @NotBlank(message = " * User name can't be blank")
    @Size(min = 2, message = " * Enter at least 2 symbols")
    private String userName;

    @NotBlank(message = " * User name can't be blank")
    @Size(min = 2, message = " * Enter at least 2 symbols")
    private String crushName;

    @AssertTrue(message = "You have to agree our conditions")
    private boolean termOfConditions;

    private String result;

    public UserInfoDTO() {
       /* System.out.println("UserInfoDTO Constructor Called");
        System.out.println("userName : " + userName);
        System.out.println("crushName : " + crushName);*/

    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    public boolean isTermOfConditions() {
        return termOfConditions;
    }

    public void setTermOfConditions(boolean termOfConditions) {
        this.termOfConditions = termOfConditions;
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
