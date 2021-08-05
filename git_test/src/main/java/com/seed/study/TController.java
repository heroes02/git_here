package com.seed.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TController {

	@RequestMapping("/")
	public String Main() {

		return "index";
	}
}
