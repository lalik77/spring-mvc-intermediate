package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProcessController {


    @RequestMapping("/process-homepage")
    public String process(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {

        if (result.hasErrors()) {

            System.out.println("Errors in method process: ");

            List<ObjectError> allErrors = result.getAllErrors();

            for (ObjectError errors : allErrors) {
                System.out.println("========>" + allErrors);
            }

            return "welcome-page";


        }

        System.out.println("Username :" + userInfoDTO.getUserName());
        System.out.println("Crushname : " + userInfoDTO.getCrushName());

        return "process-homepage";
    }
}
