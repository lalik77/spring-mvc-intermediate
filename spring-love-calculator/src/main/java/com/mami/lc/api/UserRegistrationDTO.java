package com.mami.lc.api;

import com.mami.lc.validator.Age;
import com.mami.lc.validator.VPhone;

import java.util.Arrays;
import java.util.List;

public class UserRegistrationDTO {

    private String name;
    private String userName;

    @Age
    private Integer age;

    private char[] password ;
    private String countryName;
    private String[] hobbies;
    private String gender;

    @VPhone
    private CommunicationDTO communicationDTO;


    public CommunicationDTO getCommunicationDTO() {
        return communicationDTO;
    }

    public void setCommunicationDTO(CommunicationDTO communicationDTO) {
        this.communicationDTO = communicationDTO;
    }




    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", password=" + Arrays.toString(password) +
                ", countryName='" + countryName + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", gender='" + gender + '\'' +
                ", communicationDTO=" + communicationDTO +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
