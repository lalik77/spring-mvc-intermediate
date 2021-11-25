package com.mami.lc.controllers;

import com.mami.lc.api.CreditCard;
import com.mami.lc.api.PaymentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class PaymentController {

    @RequestMapping("/payment-page")
    public String showPaymentPage(@ModelAttribute("pInfo") PaymentDTO paymentDTO) {



        System.out.println("==============================>Inside showPaymentPage from " + getClass());

        System.out.println(paymentDTO);

        //load the needed format of card
        CreditCard tempCC = new CreditCard();
        paymentDTO.setCreditCard(tempCC);


        return "payment-page";
    }



    @RequestMapping("/bill-success")
    public String showBillingSuccess(@Valid @ModelAttribute("pInfo") PaymentDTO paymentDTO,BindingResult result) {

        if(result.hasErrors()) {

            System.out.println("\n================> Errors in showBillingSuccess method from " + getClass());
        }

        System.out.println("==============================>Inside showBillingSuccess from " + getClass());

        System.out.println(paymentDTO);


        return "payment-success";
    }

}
