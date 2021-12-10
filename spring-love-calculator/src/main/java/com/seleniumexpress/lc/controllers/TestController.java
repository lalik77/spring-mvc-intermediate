package com.seleniumexpress.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.test.api.BillDTO;

@Controller
public class TestController {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("billDTO") BillDTO billDTO) {

		
		return "bill-page";
	}

	@RequestMapping(value = "/process-bill")
	public String showResultPage(@Valid @ModelAttribute("billDTO") BillDTO billDTO, BindingResult result) {

		if (result.hasErrors()) {

			return "bill-page";
		}

		return "result-page";

	}
}









