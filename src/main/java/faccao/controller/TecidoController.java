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

import faccao.model.Tecido;
import faccao.service.TecidoService;

@Controller
public class TecidoController {
	
	@Autowired
	private TecidoService tecidoService;

	@GetMapping("/index-tecido")
	public String index(HttpServletRequest request){
		return "tecido/index";
	}
	
	@GetMapping("/list-tecidos")
	public String allTecidos(HttpServletRequest request){
		request.setAttribute("tecidos", tecidoService.findAll());
		return "tecido/list";
	}
	
	@GetMapping("/new-tecido")
	public String newTecido(HttpServletRequest request){
		return "tecido/form";
	}
	
	@PostMapping("/save-tecido")
	public String saveTecido(@ModelAttribute Tecido tecido, BindingResult bindingResult, HttpServletRequest request){
		tecidoService.save(tecido);
		request.setAttribute("tecidos", tecidoService.findAll());
		return "redirect:list-tecidos";
	}
	
	@GetMapping("/update-tecido")
	public String updateTecido(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("tecido", tecidoService.findTecido(id));
		return "tecido/form";
	}
	
	@GetMapping("/delete-tecido")
	public String deleteTecido(@RequestParam int id, HttpServletRequest request){
		tecidoService.delete(id);
		request.setAttribute("tecidos", tecidoService.findAll());
		return "redirect:list-tecidos";
	}
}
