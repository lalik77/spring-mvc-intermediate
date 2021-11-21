package com.mami.lc.controllers;

import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {


    @RequestMapping("/register")
    public String showRegistrationForm(@ModelAttribute("userRegistrationDto") UserRegistrationDTO dto){

        dto.setName("Alex");


        return "user-registration-page";
    }


    @RequestMapping("/registration-success")
    public String processUserReg(@ModelAttribute("userRegistrationDto")UserRegistrationDTO dto) {
        return "reg-success";
    }
}
