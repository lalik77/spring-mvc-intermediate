package com.mami.lc.controllers;

import com.mami.lc.api.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

  @RequestMapping("/email/{userName}")
  public String sendEmail(@PathVariable("userName") String userName, Model model){

    model.addAttribute("emailDTO", new EmailDTO());
    //model.addAttribute("userName", userName.toUpperCase());

    return "email-page";
  }



  @RequestMapping("/process-email")
  public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO){
    return "process-email-page";
  }

}
