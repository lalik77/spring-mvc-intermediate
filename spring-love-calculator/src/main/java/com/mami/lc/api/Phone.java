package com.mami.lc.api;

public class Phone {

    private String countryCode;
    private String baseNumber;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(String baseNumber) {
        this.baseNumber = baseNumber;
    }

    @Override
    public String toString() {
        return countryCode + "-" + baseNumber;
    }
}
