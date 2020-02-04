package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
@Autowired
private IStdService service;

@RequestMapping("/all")
	public String showAll() {
	return "AllPage";


}
}
