package cz.jiripinkas.example.chat.controller;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cz.jiripinkas.example.chat.dto.TaskDto;
import cz.jiripinkas.example.chat.entity.Task;
import cz.jiripinkas.example.chat.service.TaskService;


@Controller
@RequestMapping("/task")
public class Task_Controller {

	@Autowired
	private TaskService taskService;
	
	@RequestMapping
	public String show() {
		return "task";
	}


	@RequestMapping("/csv")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.getWriter().write("csv,works");
	}

	@ModelAttribute("task")
	public Task create() {
		Task task = new Task();
		return task;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid Task task,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "task";
		}
		taskService.save(task);
		return "redirect:/task.html?success=true";
	}

	@RequestMapping("/tasklist")
	public String list(Model model) {
		model.addAttribute("tasks", taskService.getTasks());
		return "tasklist";
	}



	@RequestMapping("/remove")
	public String remove(Model model, @RequestParam int id) {
		taskService.delete(id);
		return "redirect:/task/tasklist.html";
	}

	
}