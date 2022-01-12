package com.mami.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"firstName","lastName"})
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
    String lastName = (String) model1.getAttribute("lastName");

    System.out.println(firstName);
    System.out.println(lastName);

    return "index";
  }


}
