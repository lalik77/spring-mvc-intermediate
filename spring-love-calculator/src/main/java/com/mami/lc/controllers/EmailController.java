package com.mami.lc.controllers;

import com.mami.lc.api.EmailDTO;
import com.mami.lc.api.UserInfoDTO;
import com.mami.lc.service.LCAppEmailServiceImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class EmailController {

  private LCAppEmailServiceImpl lcAppEmailService;

  public EmailController(LCAppEmailServiceImpl lcAppEmailService) {
    this.lcAppEmailService = lcAppEmailService;
  }

  @RequestMapping("/email")
  public String showFormToSendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {

    System.out.println("Inside method showFormToSendEmail : emailDTO :" + emailDTO);

    return "email-page";
  }

  @RequestMapping("/process-email")
  public String processEmail(Model model,@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,
      EmailDTO emailDTO) {

    model.addAttribute("emailDTO",emailDTO);
    //model.addAttribute("userInfo",userInfoDTO);

    /*System.out
        .println("Inside method process-email \n " + "User Name  " + userInfoDTO.getUserName());
    System.out.println(" Email " + emailDTO.getUserEmail());
    System.out.println(" Result " + userInfoDTO.getResult());*/
    lcAppEmailService
        .send(userInfoDTO.getUserName(), emailDTO.getUserEmail(), userInfoDTO.getResult());

    return "process-email-page";
  }

}
