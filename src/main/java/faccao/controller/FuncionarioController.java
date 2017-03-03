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

import faccao.model.Funcionario;
import faccao.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping("/index-funcionario")
	public String index(HttpServletRequest request){
		return "funcionario/index";
	}
	
	@GetMapping("/list-funcionarios")
	public String allFuncionarios(HttpServletRequest request){
		request.setAttribute("funcionarios", funcionarioService.findAll());
		return "funcionario/list";
	}
	
	@GetMapping("/new-funcionario")
	public String newFuncionario(HttpServletRequest request){
		return "funcionario/form";
	}
	
	@PostMapping("/save-funcionario")
	public String saveFuncionario(@ModelAttribute Funcionario funcionario, BindingResult bindingResult, HttpServletRequest request){
		funcionarioService.save(funcionario);
		request.setAttribute("funcionarios", funcionarioService.findAll());
		return "redirect:list-funcionarios";
	}
	
	@GetMapping("/update-funcionario")
	public String updateFuncionario(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("funcionario", funcionarioService.findFuncionario(id));
		return "funcionario/form";
	}
	
	@GetMapping("/delete-funcionario")
	public String deleteFuncionario(@RequestParam int id, HttpServletRequest request){
		funcionarioService.delete(id);
		request.setAttribute("funcionarios", funcionarioService.findAll());
		return "redirect:list-funcionarios";
	}
}
