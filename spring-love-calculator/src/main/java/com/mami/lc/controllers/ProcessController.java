package com.mami.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessController {


    @RequestMapping("/process-homepage")
    public String process(@RequestParam String userName , @RequestParam String crushName ) {

        System.out.println("Usename :" + userName);
        System.out.println("Crushname : " + crushName);

        return "process-homepage";
    }
}
