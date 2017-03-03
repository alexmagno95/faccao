package faccao.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import faccao.dao.FabricaRepository;
import faccao.model.Fabrica;

@Service
@Transactional
public class FabricaService {

	private final FabricaRepository fabricaRepository;

	public FabricaService(FabricaRepository fabricaRepository) {
		this.fabricaRepository = fabricaRepository;
	}
	
	public List<Fabrica> findAll(){
		List<Fabrica> fabricas = new ArrayList<>();
		for(Fabrica fabrica : fabricaRepository.findAll()){
			fabricas.add(fabrica);
		}
		return fabricas;
	}
	
	public Fabrica findFabrica(int id){
		return fabricaRepository.findOne(id);
	}
	
	public void save(Fabrica fabrica){
		fabricaRepository.save(fabrica);
	}
	
	public void delete(int id){
		fabricaRepository.delete(id);
	}
	
	
}
