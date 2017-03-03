package faccao.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import faccao.dao.PagamentoRepository;
import faccao.model.Pagamento;

@Service
@Transactional
public class PagamentoService {

	private final PagamentoRepository pagamentoRepository;

	public PagamentoService(PagamentoRepository pagamentoRepository) {
		this.pagamentoRepository = pagamentoRepository;
	}
	
	public List<Pagamento> findAll(){
		List<Pagamento> pagamentos = new ArrayList<>();
		for(Pagamento pagamento : pagamentoRepository.findAll()){
			pagamentos.add(pagamento);
		}
		return pagamentos;
	}
	
	public Pagamento findPagamento(int id){
		return pagamentoRepository.findOne(id);
	}
	
	public void save(Pagamento pagamento){
		pagamentoRepository.save(pagamento);
	}
	
	public void delete(int id){
		pagamentoRepository.delete(id);
	}
}
