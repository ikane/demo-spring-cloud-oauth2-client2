package org.ikane;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String home() {
		return	"home";
	}
	/*
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return	"Hello World";
	}
	*/
	
	/**
	 * Return the principal identifying the logged in user
	 * @param user
	 * @return
	 */
	@RequestMapping({"/me", "/user", "/loggedUser"})
	@ResponseBody
	public Principal getCurrentLoggedInUser(Principal user) {
		return user;
	}

}
