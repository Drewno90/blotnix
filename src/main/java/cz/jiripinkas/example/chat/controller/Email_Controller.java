package cz.jiripinkas.example.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Email_Controller {

	@RequestMapping("/emailForm")
	public String index() {
		return "emailForm";
	}
}
