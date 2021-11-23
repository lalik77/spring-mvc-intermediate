package com.mami.lc.api;

public class CommunicationDTO {

    private String email="test";
    private Phone phone;


    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CommunicationDTO{" +
                "email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
