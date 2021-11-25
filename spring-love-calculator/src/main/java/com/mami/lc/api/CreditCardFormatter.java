package com.mami.lc.api;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CreditCardFormatter implements Formatter<CreditCard> {

    @Override
    public CreditCard parse(String inputCC, Locale locale) throws ParseException {

        System.out.println("========> Inside parse method from class :" + getClass());

        if (inputCC.length()!=19 || inputCC.isEmpty() ) {

            throw new IllegalArgumentException("Format of Credit Card is incorrect");
        }

        CreditCard tmpCC = new CreditCard();

        String[] strArr = inputCC.split("-");

        tmpCC.setFirstFourDigits(Integer.parseInt(strArr[0]));
        tmpCC.setSecondFourDigits(Integer.parseInt(strArr[1]));
        tmpCC.setThirdFourDigits(Integer.parseInt(strArr[2]));
        tmpCC.setLastFourDigits(Integer.parseInt(strArr[3]));

       /* System.out.println("=====================> 1 : " + tmpCC.getFirstFourDigits());
        System.out.println("=====================> 2 : " + tmpCC.getSecondFourDigits());
        System.out.println("=====================> 3 : " + tmpCC.getThirdFourDigits());
        System.out.println("=====================> 4 : " + tmpCC.getLastFourDigits());*/

        return tmpCC;
    }

    @Override
    public String print(CreditCard creditCard, Locale locale) {

        System.out.println("==============>Inside print method from : " + getClass());

        System.out.println("=====================>Loading XXXX-XXXX-XXXX-XXXX to card number field ");




        return "XXXX-XXXX-XXXX-XXXX" ;
    }
}
