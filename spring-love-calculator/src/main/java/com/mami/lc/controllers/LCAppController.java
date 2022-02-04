package com.mami.lc.controllers;

import com.mami.lc.api.UserInfoDTO;
import com.mami.lc.service.LCAppService;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"userInfo"})
public class LCAppController {

    private LCAppService lcAppService;

    public LCAppController(LCAppService lcAppService) {
        this.lcAppService = lcAppService;
    }

    @RequestMapping("/")
    public String showHomePage(UserInfoDTO userInfoDTO, Model model) {

        model.addAttribute("userInfo", userInfoDTO);

        return "welcome-page";
    }

    @RequestMapping("/process-homepage")
    public String process(Model model,@Valid UserInfoDTO userInfoDTO,
        BindingResult result) {

        model.addAttribute("userInfo",userInfoDTO);
        model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"userInfo",result);

        // System.out.println(userInfoDTO.isTermOfConditions());

        if (result.hasErrors()) {
            System.out.println("Errors in method process from: " + this.getClass());
            return "welcome-page";
        }

        //System.out.println("Username :" + userInfoDTO.getUserName());
        // System.out.println("Crushname : " + userInfoDTO.getCrushName());

        //TODO : Write a service which will calculate the love % between the user and the crushname
        String calculationResult = lcAppService
            .calculateLove(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
        userInfoDTO.setResult(calculationResult);
        model.addAttribute("result", calculationResult);

        return "process-homepage";
    }
}
