package org.springboot.controller;

import javax.validation.Valid;

import org.springboot.form.UserInformation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(UserInformation userInformation) {
		return "index";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String addNewPost(@Valid UserInformation userInformation , BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		model.addAttribute("name", userInformation.getName());
		model.addAttribute("surname", userInformation.getSurname());
		model.addAttribute("address", userInformation.getAddress());
		return "result";
	}
}
