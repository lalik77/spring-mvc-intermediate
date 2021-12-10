package com.seleniumexpress.lc.controllers;

import com.seleniumexpress.test.api.BillDTO;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("billDTO") BillDTO billDTO) {

		
		return "bill-page";
	}

	@RequestMapping(value = "/process-bill")
	public String showResultPage(@Valid @ModelAttribute("billDTO") BillDTO billDTO,
			BindingResult result) {

		if (result.hasErrors()) {

			return "bill-page";
		}

		return "result-page";

	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", customDateEditor);

		NumberFormat numberFormat = new DecimalFormat("#,###.00");
		CustomNumberEditor customNumberEditor = new CustomNumberEditor(BigDecimal.class, numberFormat,
				true);
		binder.registerCustomEditor(BigDecimal.class,"amount",customNumberEditor);


	}
}









