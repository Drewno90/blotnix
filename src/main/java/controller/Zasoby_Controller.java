package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Zasoby_Controller {
	
	@RequestMapping("/zasoby")
	public String index(){
		return "zasoby";
	}

}
