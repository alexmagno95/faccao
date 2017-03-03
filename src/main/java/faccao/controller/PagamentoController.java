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

import faccao.model.Pagamento;
import faccao.service.PagamentoService;

@Controller
public class PagamentoController {
	
	@Autowired
	private PagamentoService pagamentoService;

	@GetMapping("/index-pagamento")
	public String index(HttpServletRequest request){
		return "pagamento/index";
	}
	
	@GetMapping("/list-pagamentos")
	public String allPagamentos(HttpServletRequest request){
		request.setAttribute("pagamentos", pagamentoService.findAll());
		return "pagamento/list";
	}
	
	@GetMapping("/new-pagamento")
	public String newPagamento(HttpServletRequest request){
		return "pagamento/form";
	}
	
	@PostMapping("/save-pagamento")
	public String savePagamento(@ModelAttribute Pagamento pagamento, BindingResult bindingResult, HttpServletRequest request){
		pagamentoService.save(pagamento);
		request.setAttribute("pagamentos", pagamentoService.findAll());
		return "redirect:list-pagamentos";
	}
	
	@GetMapping("/update-pagamento")
	public String updatePagamento(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("pagamento", pagamentoService.findPagamento(id));
		return "pagamento/form";
	}
	
	@GetMapping("/delete-pagamento")
	public String deletePagamento(@RequestParam int id, HttpServletRequest request){
		pagamentoService.delete(id);
		request.setAttribute("pagamentos", pagamentoService.findAll());
		return "redirect:list-pagamentos";
	}
}
