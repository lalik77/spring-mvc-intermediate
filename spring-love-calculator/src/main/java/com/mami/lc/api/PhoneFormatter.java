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

        Phone phone = new Phone();

        String [] str = completeNumber.split("-");

        int index = completeNumber.indexOf("-");

        if( index == -1 || completeNumber.startsWith("-")) {

            //the '-' is not provide by client

            phone.setCountryCode("+7");

            if(completeNumber.startsWith("-")) {
                phone.setBaseNumber(str[1]);
            }else {
                phone.setBaseNumber(str[0]);
            }

            
        } else  {

            phone.setCountryCode(str[0]);
            phone.setBaseNumber(str[1]);

        }

        //System.out.println(phone.getCountryCode() + "--" + phone.getBaseNumber());

        return phone;

    }
}
