package com.mami.lc.api;

public class UserInfoDTO {

    private String userName = "Default Name";
    private String crushName = "Default CrshName";

    public UserInfoDTO() {
        System.out.println("Constructor Called");
        System.out.println(this.hashCode());
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
