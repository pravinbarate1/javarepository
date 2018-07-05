package com.pravin.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pravin.beans.Welcome;

@Controller
public class WelcomeController {

	private static final String welcomeMsg = "Welcome Mr. %s!";
	
	@GetMapping("/welcome/user")
	@ResponseBody
	public Welcome welcomeUser(@RequestParam(name="name",required=false, defaultValue="Java Fan") String name) {
		return new Welcome(String.format(welcomeMsg, name));
	}
}
