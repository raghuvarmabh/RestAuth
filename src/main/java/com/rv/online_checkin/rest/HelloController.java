package com.rv.online_checkin.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping({ "/admin" })
	public String helloAdmin() {
		return "Hello Admin";
	}
	
	@RequestMapping({ "/user" })
	public String helloUser() {
		return "Hello User";
	}

}