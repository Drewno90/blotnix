package cz.jiripinkas.example.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Recv_Controller {

	@RequestMapping("/recvForm")
	public String index() {
		return "recvForm";
	}
}
