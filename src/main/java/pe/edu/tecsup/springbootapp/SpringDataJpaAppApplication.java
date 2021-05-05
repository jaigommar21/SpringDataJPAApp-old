package pe.edu.tecsup.springbootapp;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;
import pe.edu.tecsup.springbootapp.services.CategoriaService;
import pe.edu.tecsup.springbootapp.services.ProductoService;

@SpringBootApplication
public class SpringDataJpaAppApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(SpringDataJpaAppApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaAppApplication.class);
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private ProductoService productoService;
	
	@Override
	public void run(String... args) throws Exception {

		List<Categoria> categorias 
			= categoriaService.findByNombre("Memorias");
		
		log.info(categorias.toString());
		
		Categoria categoria 
			= categoriaService.findById(Long.valueOf(1)).get();
	
		log.info(categoria.toString());
	
		
		
		/*
		List<Categoria> categorias = categoriaService.findAll();
		
		log.info(" - Lista de Categorias -------------- ");
		for (Categoria categoria : categorias) {
			log.info("---> " + categoria);
			for (Producto producto : categoria.getProductos()) {
				log.info("-------> " + producto);
			}
		}
		log.info(" ----------------------------------- ");
		
		
		List<Producto> productos = productoService.findAll();
		
		log.info(" - Lista de Productos--------------- ");
		for (Producto producto : productos) {
			log.info("--> " + producto);
		}
		log.info(" ----------------------------------- ");
		
		
		Producto productoNuevo = new Producto();
		Categoria categoria = new Categoria();
		categoria.setId(2L);
		productoNuevo.setCategoria(categoria);
		productoNuevo.setNombre("Kingstone");
		productoNuevo.setDescripcion("Kingstone 64GB DDR3");
		productoNuevo.setPrecio(80.0);
		productoNuevo.setStock(12); 
		productoNuevo.setCreado(new Date());
		productoNuevo.setEstado(1);
		
		Producto productoRegistrado = productoService.save(productoNuevo);
		log.info(" - Producto Registrado --------------- ");
		log.info("--> " + productoRegistrado);
		log.info(" ------------------------------------- ");
		
		
		productos = productoService.findAll();
		
		log.info(" - Lista de Productos--------------- ");
		for (Producto producto : productos) {
			log.info("--> " + producto);
		}
		log.info(" ----------------------------------- ");
		*/
	}


}
