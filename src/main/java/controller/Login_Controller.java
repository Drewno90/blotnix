package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login_Controller {

	@RequestMapping("/log")
	public String index() {
		return "log";
	}
}
