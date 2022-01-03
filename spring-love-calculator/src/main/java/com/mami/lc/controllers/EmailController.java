package com.mami.lc.controllers;

import com.mami.lc.api.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

  @RequestMapping("/email")
  public String sendEmail(@CookieValue("lcApp.username") String userName, Model model ){

    model.addAttribute("userName",userName);
    model.addAttribute("emailDTO",new EmailDTO());

    return "email-page";
  }

  @RequestMapping("/process-email")
  public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO){
    return "process-email-page";
  }

}
