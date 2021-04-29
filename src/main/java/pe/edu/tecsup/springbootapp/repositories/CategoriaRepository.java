package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.springbootapp.entities.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

	@Override
	List<Categoria> findAll();

	
}
