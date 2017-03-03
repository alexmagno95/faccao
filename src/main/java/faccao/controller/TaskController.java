package faccao.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import faccao.model.Task;
import faccao.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")
	public String home(HttpServletRequest request){
		return "home";
	}

	@GetMapping("/index-task")
	public String index(HttpServletRequest request){
		return "task/index";
	}
	
	@GetMapping("/list-tasks")
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", taskService.findAll());
		return "task/list";
	}
	
	@GetMapping("/new-task")
	public String newTask(HttpServletRequest request){
		return "task/form";
	}
	
	@PostMapping("/save-task")
	public String saveTask(@ModelAttribute Task task, BindingResult bindingResult, HttpServletRequest request){
		task.setDateCreated(new Date());
		taskService.save(task);
		request.setAttribute("tasks", taskService.findAll());
		return "redirect:list-tasks";
	}
	
	@GetMapping("/update-task")
	public String updateTask(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", taskService.findTask(id));
		return "task/form";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id, HttpServletRequest request){
		taskService.delete(id);
		request.setAttribute("tasks", taskService.findAll());
		return "redirect:list-tasks";
	}
}
