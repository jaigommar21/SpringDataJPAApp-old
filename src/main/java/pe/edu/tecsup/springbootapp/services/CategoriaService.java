package pe.edu.tecsup.springbootapp.services;

import java.util.List;
import java.util.Optional;

import pe.edu.tecsup.springbootapp.entities.Categoria;

public interface CategoriaService {

	public Optional<Categoria> findById(Long id);
	
	public List<Categoria> findAll();
	
	public List<Categoria> findByNombre(String nombre);

	public List<Categoria> findByNombreAndOrden(String nombre, Integer orden);

}

