package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {

    @RequestMapping("/")
    public String showHomePage( Model model) {

        model.addAttribute("userInfo",new UserInfoDTO());

        return "welcome-page";
    }


    @RequestMapping("/process-homepage")
    public String process(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {

        System.out.println(userInfoDTO.isTermOfConditions());

        if (result.hasErrors()) {

            System.out.println("Errors in method process from: " + this.getClass());

            return "welcome-page";


        }

        System.out.println("Username :" + userInfoDTO.getUserName());
        System.out.println("Crushname : " + userInfoDTO.getCrushName());


        //Write a service which will calculate the love % between the user and the crushname

        return "process-homepage";
    }



}
