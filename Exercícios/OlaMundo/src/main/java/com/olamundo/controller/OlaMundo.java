package com.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class OlaMundo {
	@GetMapping
	public String hello() {
		return "Preciso aprender Springboot.";
	}
}
