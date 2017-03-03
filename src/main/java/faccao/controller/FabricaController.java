package faccao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import faccao.model.Fabrica;
import faccao.service.FabricaService;
import faccao.service.ModaService;

@Controller
public class FabricaController {
	
	@Autowired
	private FabricaService fabricaService;
	@Autowired
	private ModaService modaService;

	@GetMapping("/index-fabrica")
	public String index(HttpServletRequest request){
		return "fabrica/index";
	}
	
	@GetMapping("/list-fabricas")
	public String allFabricas(HttpServletRequest request){
		request.setAttribute("fabricas", fabricaService.findAll());
		return "fabrica/list";
	}
	
	@GetMapping("/new-fabrica")
	public String newFabrica(HttpServletRequest request){
		request.setAttribute("modas", modaService.findAll());
		return "fabrica/form";
	}
	
	@PostMapping("/save-fabrica")
	public String saveFabrica(@ModelAttribute Fabrica fabrica, BindingResult bindingResult, HttpServletRequest request){
		fabricaService.save(fabrica);
		return "redirect:list-fabricas";
	}
	
	@GetMapping("/update-fabrica")
	public String updateFabrica(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("fabrica", fabricaService.findFabrica(id));
		return "fabrica/form";
	}
	
	@GetMapping("/delete-fabrica")
	public String deleteFabrica(@RequestParam int id, HttpServletRequest request){
		fabricaService.delete(id);
		request.setAttribute("fabricas", fabricaService.findAll());
		return "redirect:list-fabricas";
	}
}
