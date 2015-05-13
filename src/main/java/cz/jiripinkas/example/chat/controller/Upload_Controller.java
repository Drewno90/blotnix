package cz.jiripinkas.example.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Upload_Controller {
	
	@RequestMapping("/upload")
	public String index(){
		return "upload";
	}

}
