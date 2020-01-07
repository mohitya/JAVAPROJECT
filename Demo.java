package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
@RequestMapping("/all")
	public String showAll() {
	return "AllPage";
}
}
