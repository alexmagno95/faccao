package faccao.dao;

import org.springframework.data.repository.CrudRepository;

import faccao.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
