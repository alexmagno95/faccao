package faccao.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import faccao.dao.TecidoRepository;
import faccao.model.Tecido;

@Service
@Transactional
public class TecidoService {

	private final TecidoRepository tecidoRepository;

	public TecidoService(TecidoRepository tecidoRepository) {
		this.tecidoRepository = tecidoRepository;
	}
	
	public List<Tecido> findAll(){
		List<Tecido> tecidos = new ArrayList<>();
		for(Tecido tecido : tecidoRepository.findAll()){
			tecidos.add(tecido);
		}
		return tecidos;
	}
	
	public Tecido findTecido(int id){
		return tecidoRepository.findOne(id);
	}
	
	public void save(Tecido tecido){
		tecidoRepository.save(tecido);
	}
	
	public void delete(int id){
		tecidoRepository.delete(id);
	}
}
