package com.virtusa.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String getHomePage() {
		return "UserManagement";
	}

	@RequestMapping(value = "/RegisterUser", method = RequestMethod.GET)
	public String getRegisterUser() {
		return "RegisterUser";
	}
}
