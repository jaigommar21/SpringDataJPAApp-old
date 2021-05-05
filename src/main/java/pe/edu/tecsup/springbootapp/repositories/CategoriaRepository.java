package pe.edu.tecsup.springbootapp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.springbootapp.entities.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

	//@Override
	Optional<Categoria> findById(Long id);
	
	@Override
	List<Categoria> findAll();

	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	List<Categoria> findByNombre(String nombre);

	List<Categoria> findByNombreAndOrden(String nombre, Integer orden);

	
}
