package cz.jiripinkas.example.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Harmonogram_Controller {
	
	@RequestMapping("/harmonogram")
	public String index(){
		return "harmonogram";
	}

}
