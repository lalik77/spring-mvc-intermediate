package com.mami.lc.controllers;

import com.mami.lc.api.EmailDTO;
import com.mami.lc.api.UserInfoDTO;
import com.mami.lc.service.LCAppEmailServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class EmailController {

  private LCAppEmailServiceImpl lcAppEmailService;

  public EmailController(LCAppEmailServiceImpl lcAppEmailService) {
    this.lcAppEmailService = lcAppEmailService;
  }

  @RequestMapping("/email")
  public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {

    return "email-page";
  }

  @RequestMapping("/process-email")
  public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,
      @ModelAttribute("emailDTO") EmailDTO emailDTO) {

    System.out
        .println("Inside method process-email \n " + "User Name  " + userInfoDTO.getUserName());
    System.out.println(" Email " + emailDTO.getUserEmail());

     lcAppEmailService.send(userInfoDTO.getUserName(),emailDTO.getUserEmail(),"Friend");

    return "process-email-page";
  }

}
