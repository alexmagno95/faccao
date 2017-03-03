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

import faccao.model.Moda;
import faccao.service.ModaService;

@Controller
public class ModaController {
	
	@Autowired
	private ModaService modaService;

	@GetMapping("/index-moda")
	public String index(HttpServletRequest request){
		return "moda/index";
	}
	
	@GetMapping("/list-modas")
	public String allModas(HttpServletRequest request){
		request.setAttribute("modas", modaService.findAll());
		return "moda/list";
	}
	
	@GetMapping("/new-moda")
	public String newModa(HttpServletRequest request){
		return "moda/form";
	}
	
	@PostMapping("/save-moda")
	public String saveModa(@ModelAttribute Moda moda, BindingResult bindingResult, HttpServletRequest request){
		modaService.save(moda);
		request.setAttribute("modas", modaService.findAll());
		return "redirect:list-modas";
	}
	
	@GetMapping("/update-moda")
	public String updateModa(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("moda", modaService.findModa(id));
		return "moda/form";
	}
	
	@GetMapping("/delete-moda")
	public String deleteModa(@RequestParam int id, HttpServletRequest request){
		modaService.delete(id);
		request.setAttribute("modas", modaService.findAll());
		return "redirect:list-modas";
	}
}
