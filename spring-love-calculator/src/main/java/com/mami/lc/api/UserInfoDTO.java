package com.mami.lc.api;

public class UserInfoDTO {

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
}
