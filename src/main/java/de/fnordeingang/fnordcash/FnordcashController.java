package de.fnordeingang.fnordcash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import de.fnordeingang.fnordcash.data.FeeRepository;

@Controller
public class FnordcashController {
	
	@Autowired FeeRepository feeRepository;

	@RequestMapping("/")
	String index() {
		return "index";
	}

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("fees", feeRepository.findAll());
		return "test";
	}
}
