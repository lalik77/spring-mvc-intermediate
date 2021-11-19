package com.mami.lc.api;

import java.util.Objects;

public class UserInfoDTO {

    private String userName = "Default Name";
    private String crushName = "Default CrshName";

    public UserInfoDTO() {
        System.out.println("Constructor Called");
        System.out.println(this.hashCode());
    }

    public String getUserName() {
        System.out.println("=====> From User Name Getter " + userName.hashCode());
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        System.out.println("=====> From CrushName Getter " + crushName.hashCode());
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
