package com.mami.lc.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class SecondController {
  @RequestMapping("/forth")
  public String handlingMethod4(/*@SessionAttribute("firstName") String fName,*/ Model model,
      HttpSession session) {

    //String  firstName =(String)model.getAttribute("firstName");

   // String newFName = "Mr " + fName;

   // model.addAttribute("firstName",fName);

    //System.out.println("===> Inside Second Controller method " + newFName );

    //retrieving the session attr from http session

    String adress = (String ) session.getAttribute("adress");
    String newAdr = adress + " - Bainem when I Live ";

    model.addAttribute("adress",newAdr);

    //session.invalidate();

    return "index";
  }

}
