package faccao.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import faccao.dao.ModaRepository;
import faccao.model.Moda;

@Service
@Transactional
public class ModaService {

	private final ModaRepository modaRepository;

	public ModaService(ModaRepository modaRepository) {
		this.modaRepository = modaRepository;
	}
	
	public List<Moda> findAll(){
		List<Moda> modas = new ArrayList<>();
		for(Moda moda : modaRepository.findAll()){
			modas.add(moda);
		}
		return modas;
	}
	
	public Moda findModa(int id){
		return modaRepository.findOne(id);
	}
	
	public void save(Moda moda){
		modaRepository.save(moda);
	}
	
	public void delete(int id){
		modaRepository.delete(id);
	}
}
