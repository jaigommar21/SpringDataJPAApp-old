package pe.edu.tecsup.springbootapp.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;

@SpringBootTest
public class CategoriaServiceTest {

	@Autowired
	private ProductoService productoService;

	
	@Test
	void listarTest() throws Exception{
		
		List<Producto> productos = productoService.findAll();
		
		assertThat(productos.isEmpty(), is(false));
	}

	@Test
	void registarTest() throws Exception{
		
		List<Producto> productos = productoService.findAll();
		int totalAntes = productos.size();
		
		Producto productoNuevo = new Producto();
		Categoria categoria = new Categoria();
		categoria.setId(2L);
		productoNuevo.setCategoria(categoria);
		productoNuevo.setNombre("AMD");
		productoNuevo.setDescripcion("AMD X10");
		productoNuevo.setPrecio(280.0);
		productoNuevo.setStock(6);
		productoNuevo.setCreado(new Date());
		productoNuevo.setEstado(1);
		productoService.save(productoNuevo);
		
		productos = productoService.findAll();
		int totalDespues = productos.size();
		
		assertThat(totalDespues - totalAntes, is(1));
	}
	
	@Test
	void eliminarTest() throws Exception{
		
		List<Producto> productos = productoService.findAll();
		int totalAntes = productos.size();
		
		if(productos.isEmpty()) {
			return;	// test pass
		}
		
		Producto ultimoProducto = productos.get(productos.size() - 1);
		productoService.deleteById(ultimoProducto.getId());
		
		productos = productoService.findAll();
		int totalDespues = productos.size();
		
		assertThat(totalAntes - totalDespues, is(1));
	}


}
