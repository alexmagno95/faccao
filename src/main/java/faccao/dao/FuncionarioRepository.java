package faccao.dao;

import org.springframework.data.repository.CrudRepository;

import faccao.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer>{

}