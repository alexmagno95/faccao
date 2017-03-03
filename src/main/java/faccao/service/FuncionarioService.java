package faccao.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import faccao.dao.FuncionarioRepository;
import faccao.model.Funcionario;

@Service
@Transactional
public class FuncionarioService {

	private final FuncionarioRepository funcionarioRepository;

	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public List<Funcionario> findAll(){
		List<Funcionario> funcionarios = new ArrayList<>();
		for(Funcionario funcionario : funcionarioRepository.findAll()){
			funcionarios.add(funcionario);
		}
		return funcionarios;
	}
	
	public Funcionario findFuncionario(int id){
		return funcionarioRepository.findOne(id);
	}
	
	public void save(Funcionario funcionario){
		funcionarioRepository.save(funcionario);
	}
	
	public void delete(int id){
		funcionarioRepository.delete(id);
	}
}
