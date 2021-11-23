package com.mami.lc.api;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {

    @Override
    public String print(Phone phone, Locale locale) {

        System.out.println("==============>Inside print method from : " + getClass());

        return phone.getCountryCode() + "-" + phone.getBaseNumber();


    }

    @Override
    public Phone parse(String completeNumber, Locale locale) throws ParseException {

        System.out.println("========> Inside parse method from class :" + getClass());

        String [] str = completeNumber.split("-");

        Phone phone = new Phone();

        phone.setCountryCode(str[0]);
        phone.setBaseNumber(str[1]);

        //System.out.println(phone.getCountryCode() + "--" + phone.getBaseNumber());

        return phone;

    }
}
