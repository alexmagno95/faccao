package faccao.dao;

import org.springframework.data.repository.CrudRepository;

import faccao.model.Pagamento;

public interface PagamentoRepository extends CrudRepository<Pagamento, Integer>{

}