package com.curso.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/administrator")
public class AdministratorController {
	
	@GetMapping
	public String Home() {
		return "administrador/home";
	}

}
