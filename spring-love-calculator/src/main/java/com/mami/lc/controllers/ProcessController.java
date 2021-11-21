package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class ProcessController {


    @RequestMapping("/process-homepage")
    public String process(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {

        System.out.println(userInfoDTO.isTermOfConditions());

        if (result.hasErrors()) {

            System.out.println("Errors in method process from: " + this.getClass());

            return "welcome-page";


        }

        System.out.println("Username :" + userInfoDTO.getUserName());
        System.out.println("Crushname : " + userInfoDTO.getCrushName());

        return "process-homepage";
    }
}
