package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Raporty_Controller {
	
	@RequestMapping("/raporty")
	public String index(){
		return "raporty";
	}

}
