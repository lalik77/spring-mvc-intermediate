package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
        HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();

        for (Cookie temp : cookies) {
            if (temp.getName().equals("lcApp.username")) {
            //if( "lcApp.username".equals(temp.getName()) ) {

                String myUserName = temp.getValue();
                userInfoDTO.setUserName(myUserName);
            }
        }

        return "welcome-page";
    }


    @RequestMapping("/process-homepage")
    public String process(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
        BindingResult result,
        HttpServletResponse response) {

        System.out.println(userInfoDTO.isTermOfConditions());

        if (result.hasErrors()) {
            System.out.println("Errors in method process from: " + this.getClass());
            return "welcome-page";
        }

        System.out.println("Username :" + userInfoDTO.getUserName());
        System.out.println("Crushname : " + userInfoDTO.getCrushName());

        // Create a Cookie for the username
        Cookie theCookie = new Cookie("lcApp.username", userInfoDTO.getUserName());
        theCookie.setMaxAge(60 * 60 * 24);

        response.addCookie(theCookie);

        //Write a service which will calculate the love % between the user and the crushname

        return "process-homepage";
    }



}
