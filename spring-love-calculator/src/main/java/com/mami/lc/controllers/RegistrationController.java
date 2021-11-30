package com.mami.lc.controllers;

import com.mami.lc.api.CommunicationDTO;
import com.mami.lc.api.Phone;
import com.mami.lc.api.UserRegistrationDTO;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

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

        System.out.println("==========================> Name is " + "|" + dto.getName() + "|");

        System.out.println("================>Inside processUserReg method from " + getClass());

        if(result.hasErrors()) {

            System.out.println("====================> Errors with validation inside processUserReg method in "
                    + getClass());

            List<ObjectError> allErrors = result.getAllErrors();

            List<ObjectError> objectErrorList = allErrors.stream().collect(Collectors.toList());

            System.out.println(objectErrorList);

            return "user-registration-page";
        }

        System.out.println(dto);


        return "reg-success";
    }


    @InitBinder
    public void initBinder(WebDataBinder binder){

        System.out.println("===================>Inside init binder");

        StringTrimmerEditor editor = new StringTrimmerEditor(false) ;
        binder.registerCustomEditor(String.class,"name",editor);
        //binder.setDisallowedFields("name");

        }
}
