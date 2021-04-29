package pe.edu.tecsup.springbootapp.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.springbootapp.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

	@Override
	List<Producto> findAll();

}
