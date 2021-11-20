package com.mami.lc.controllers;

import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {


    @RequestMapping("/register")
    public String showRegistrationForm(Model model){

        UserRegistrationDTO userRegistrationDTO=new UserRegistrationDTO();

        model.addAttribute("userRegistrationDto",userRegistrationDTO);

        return "user-registration-page";
    }
}
