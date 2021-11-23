package com.mami.lc.controllers;

import com.mami.lc.api.CommunicationDTO;
import com.mami.lc.api.Phone;
import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {


    @RequestMapping("/register")
    public String showRegistrationForm(@ModelAttribute("userRegistrationDto") UserRegistrationDTO dto){

        System.out.println("================>Inside showRegistrationForm method from " + getClass());

        //load the saved info from db
        Phone phone = new Phone();
        phone.setCountryCode("92");
        phone.setBaseNumber("7876555");

        CommunicationDTO communicationDTO = new CommunicationDTO();

        communicationDTO.setPhone(phone);

        dto.setCommunicationDTO(communicationDTO);

        dto.setName("Alex");


        return "user-registration-page";
    }


    @RequestMapping("/registration-success")
    public String processUserReg(@ModelAttribute("userRegistrationDto")UserRegistrationDTO dto) {
        return "reg-success";
    }
}
