package com.mami.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"firstName","lastName"})
public class FirstController {

  @RequestMapping("/firsts")
  public String handlingMethod1(Model model, HttpServletRequest request) {

    model.addAttribute("firstName", "Alex");
    model.addAttribute("lastName", "Mami");

    model.addAttribute("next", "/seconds");
    HttpSession session = request.getSession();
    session.setAttribute("adress","Bainem");
    return "index";
  }


  @RequestMapping("/seconds")
  public String handlingMethod2(Model model1, SessionStatus status) {

    String firstName = (String) model1.getAttribute("firstName");
    String lastName = (String) model1.getAttribute("lastName");

    System.out.println(firstName);
    System.out.println(lastName);
    model1.addAttribute("next", "/thirds");

    //removing the sessions attributes from the session scope
   // status.setComplete();

    return "index";
  }

  @RequestMapping("/thirds")
  public String handlingMethod3(Model model2,HttpSession session, SessionStatus status) {

    String lastName = (String) model2.getAttribute("lastName");

    /*model2.addAttribute("lastName",
        lastName); // not required -> it's always accessible because of @SessionAttribute*/

    model2.addAttribute("next","/forth");
    //status.setComplete();

    String adress = (String ) session.getAttribute("adress");
    String newAdr = adress + " - Home sweet Home";

    model2.addAttribute("adress",newAdr);

    return "index";
  }


}
