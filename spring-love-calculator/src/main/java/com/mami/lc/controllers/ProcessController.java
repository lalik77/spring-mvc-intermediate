package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProcessController {


    @RequestMapping("/process-homepage")
    public String process(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

        System.out.println("Username :" + userInfoDTO.getUserName());
        System.out.println("Crushname : " + userInfoDTO.getCrushName());

        return "process-homepage";
    }
}
