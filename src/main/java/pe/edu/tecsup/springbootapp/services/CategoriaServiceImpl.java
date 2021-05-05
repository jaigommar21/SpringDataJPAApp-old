package pe.edu.tecsup.springbootapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public Optional<Categoria> findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}
	
	@Override
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	@Override
	public List<Categoria> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return categoriaRepository.findByNombre(nombre);
	}

	@Override
	public List<Categoria> findByNombreAndOrden(String nombre, Integer orden) {
		// TODO Auto-generated method stub
		return findByNombreAndOrden(nombre, orden);
	}



}
