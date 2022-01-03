package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
        HttpServletRequest request) {

        String userName =(String) request.getSession().getAttribute("userName");

        userInfoDTO.setUserName(userName);
        return "welcome-page";
    }

    @RequestMapping("/process-homepage")
    public String process(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result,
        HttpServletRequest request) {

        System.out.println(userInfoDTO.isTermOfConditions());

        if (result.hasErrors()) {
            System.out.println("Errors in method process from: " + this.getClass());
            return "welcome-page";
        }

        HttpSession session = request.getSession();
        session.setAttribute("userName",userInfoDTO.getUserName());

        System.out.println("Username :" + userInfoDTO.getUserName());
        System.out.println("Crushname : " + userInfoDTO.getCrushName());
        //Write a service which will calculate the love % between the user and the crushname
        return "process-homepage";
    }

}
