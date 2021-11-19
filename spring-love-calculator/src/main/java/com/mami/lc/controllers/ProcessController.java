package com.mami.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessController {


    @RequestMapping("/process-homepage")
    public String process(@RequestParam("userName") String userName1 , @RequestParam("crushName")  String crushName1 ) {

        System.out.println("Usename :" + userName1);
        System.out.println("Crushname : " + crushName1);

        return "process-homepage";
    }
}
