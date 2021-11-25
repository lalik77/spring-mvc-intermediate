package com.mami.lc.api;

import java.math.BigDecimal;

public class Amount {

    private BigDecimal billAmount;
    private String localeDefinition;

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public String getLocaleDefinition() {
        return localeDefinition;
    }

    public void setLocaleDefinition(String localeDefinition) {
        this.localeDefinition = localeDefinition;
    }

    @Override
    public String toString() {
        return localeDefinition + "" + billAmount ;
    }
}
