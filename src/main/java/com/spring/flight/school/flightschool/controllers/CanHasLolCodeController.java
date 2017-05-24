package com.spring.flight.school.flightschool.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "", "/" })
public class CanHasLolCodeController {

	public CanHasLolCodeController() {

	}

	@GetMapping()
	public String lolCodeMe() {
		return "HAI 1.2/n" + "CAN HAS STDIO/n" + "VISIBLE 'HAI WORLD!!!1!/n" + "KTHXBAI";
	}

	@GetMapping("/chezburgr")
	public String chezBurgrMe() {
		return "HAS CHEZBURGR";
	}
}
