package com.mami.lc.api;


public class PaymentDTO {

    private CreditCard creditCard;

    private Amount amount;


    public CreditCard getCreditCard() {
        return creditCard;
    }


    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "creditCard=" + creditCard +
                ", amount=" + amount +
                '}';
    }
}
