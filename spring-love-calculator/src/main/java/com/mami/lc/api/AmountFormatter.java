package com.mami.lc.api;

import org.springframework.format.Formatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class AmountFormatter implements Formatter<Amount> {

    @Override
    public Amount parse(String inputAmount, Locale locale) throws ParseException {

        System.out.println("      ==============>Inside parse method from : " + getClass());

        Amount tempAmnt = new Amount();

        Currency currency = Currency.getInstance(locale);
        System.out.println(currency);
        String symbol = currency.getSymbol(locale);
        System.out.println(symbol);

        if (!inputAmount.contains(" ")) {
            tempAmnt.setBillAmount(new BigDecimal(inputAmount));
            tempAmnt.setLocaleDefinition(symbol);
            return tempAmnt;
        }

        // Currency currency = Currency.getInstance(locale);
        // NumberFormat format = NumberFormat.getCurrencyInstance();

        String[] arr = inputAmount.split(" ");
        BigDecimal bigDecimal = new BigDecimal(arr[0]);


        if (arr[1].equals("DOLLARS")) {

            currency = Currency.getInstance(Locale.US);

            symbol=currency.getSymbol(Locale.US);

            tempAmnt.setLocaleDefinition(symbol);

        }
        if (arr[1].equals("EURO")) {

            currency = Currency.getInstance(Locale.GERMANY);

            symbol=currency.getSymbol(Locale.GERMANY);
            tempAmnt.setLocaleDefinition(symbol);

        }

        tempAmnt.setBillAmount(bigDecimal);


        return tempAmnt;
    }

    @Override
    public String print(Amount amount, Locale locale) {


        return null;
    }
}
