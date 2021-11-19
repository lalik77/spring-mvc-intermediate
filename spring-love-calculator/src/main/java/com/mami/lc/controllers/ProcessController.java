package com.mami.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessController {


    @RequestMapping("/process-homepage")
    public String process(@RequestParam("userName") String userName1 ,
                          @RequestParam("crushName")  String crushName1,
                          Model model ) {

        model.addAttribute("uname", userName1);
        model.addAttribute("cname", crushName1);

        System.out.println("Username :" + userName1);
        System.out.println("Crushname : " + crushName1);

        return "process-homepage";
    }
}
