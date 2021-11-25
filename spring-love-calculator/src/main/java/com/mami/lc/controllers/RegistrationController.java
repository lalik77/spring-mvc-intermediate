package com.mami.lc.controllers;

import com.mami.lc.api.CommunicationDTO;
import com.mami.lc.api.Phone;
import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {


    @RequestMapping("/register")
    public String showRegistrationForm(@ModelAttribute("userRegistrationDto") UserRegistrationDTO dto){

        System.out.println("================>Inside showRegistrationForm method from " + getClass());

        System.out.println(dto);

        //load the saved info from db

       /* Phone phone = new Phone();
        phone.setCountryCode("92");
        phone.setBaseNumber("7876555");

        CommunicationDTO communicationDTO = new CommunicationDTO();

        communicationDTO.setPhone(phone);

        dto.setCommunicationDTO(communicationDTO);

        dto.setName("Alex");*/


        return "user-registration-page";
    }


    @RequestMapping("/registration-success")
    public String processUserReg(@Valid @ModelAttribute("userRegistrationDto")UserRegistrationDTO dto,
                                 BindingResult result) {

        System.out.println("================>Inside processUserReg method from " + getClass());

        if(result.hasErrors()) {

            System.out.println("====================> Errors with validation inside processUserReg method in "
                    + getClass());

            

            return "user-registration-page";
        }

        System.out.println(dto);


        return "reg-success";
    }
}
