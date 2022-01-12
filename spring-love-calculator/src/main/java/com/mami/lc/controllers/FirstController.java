package com.mami.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

  @RequestMapping("/firsts")
  public String handlingMethod1(Model model) {

    model.addAttribute("firstName","Alex");
    model.addAttribute("lastName","Mami");
    return "index";
  }


  @RequestMapping("/seconds")
  public String handlingMethod2(Model model1) {

    String firstName = (String) model1.getAttribute("firstName");

    System.out.println(firstName);

    return "index";
  }


}
