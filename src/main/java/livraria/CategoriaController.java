package livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
	private static final List<Categoria> listCategoria = new ArrayList<Categoria>();
	public CategoriaController() {
		listCategoria.add(new Categoria(1, "Acao"));
		listCategoria.add(new Categoria(2, "Terror"));
		listCategoria.add(new Categoria(3, "Comedia"));
	}
	@RequestMapping(value="/api/categorias/{id}", method=RequestMethod.GET)
	public Categoria categoria(@PathVariable("id") Long id) {
		for (Categoria categoria : listCategoria) {
			if (categoria.getId() == id) {
				return categoria;
			}
		}		
		return null;
	}
	@RequestMapping("api/categorias")
	public List<Categoria> listaCategorias(){	
		return listCategoria;		
	}
	
	@RequestMapping(value="/api/categorias/{id}", method=RequestMethod.DELETE)
	public List<Categoria> deleteCategoria(@PathVariable("id") Long id) {	
		for (Categoria categoria : listCategoria) {
			if (categoria.getId() == id) {
				listCategoria.remove(categoria);
				return listCategoria;
			}
		}		
		return null;
	}
	@RequestMapping(value="/api/categorias/{id}", method=RequestMethod.PUT)
	public Categoria updateCategoria(@PathVariable("id") Long id, @RequestParam String nome) {	
		for (Categoria categoria : listCategoria) {
			if (categoria.getId() == id) {
				
				categoria.setNome(nome);
				
				return categoria;
			}
		}		
		return null;
	}


}
