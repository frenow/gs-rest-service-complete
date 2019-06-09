package livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {
	private static final List<Autor> listAutores = new ArrayList<Autor>();
	
	public AutorController() {
		listAutores.add(new Autor(1, "Joao"));
		listAutores.add(new Autor(2, "Maria"));
		listAutores.add(new Autor(3, "Jose"));
	}

	@RequestMapping(value="/api/autores/{id}", method=RequestMethod.GET)
	public Autor autor(@PathVariable("id") Long id) {
		for (Autor autor : listAutores) {
			if (autor.getId() == id) {
				return autor;
			}
		}		
		return null;
	}
	@RequestMapping("api/autores")
	public List<Autor> listaAutores(){	
		return listAutores;		
	}
	
	@RequestMapping(value="/api/autores/{id}", method=RequestMethod.DELETE)
	public List<Autor> deleteAutor(@PathVariable("id") Long id) {	
		for (Autor autor : listAutores) {
			if (autor.getId() == id) {
				listAutores.remove(autor);
				return listAutores;
			}
		}		
		return null;
	}
	@RequestMapping(value="/api/autores/{id}", method=RequestMethod.PUT)
	public Autor updateLivro(@PathVariable("id") Long id, @RequestParam String nome) {	
		for (Autor autor : listAutores) {
			if (autor.getId() == id) {
				
				autor.setNome(nome);
				
				return autor;
			}
		}		
		return null;
	}


}
