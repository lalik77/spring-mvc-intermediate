package com.mami.lc.test;

import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Currency currency=Currency.getInstance(Locale.US);
        System.out.println(currency);
        String symbol = currency.getSymbol(Locale.US);
        System.out.println(symbol);


    }



}
