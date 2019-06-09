package livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditoraController {
	private static final List<Editora> listEditora = new ArrayList<Editora>();
	
	public EditoraController() {
		listEditora.add(new Editora(1, "Abril"));
		listEditora.add(new Editora(2, "Grupo Planeta"));
		listEditora.add(new Editora(3, "Pearson"));
	}
	@RequestMapping(value="/api/editoras/{id}", method=RequestMethod.GET)
	public Editora editora(@PathVariable("id") Long id) {
		for (Editora editora : listEditora) {
			if (editora.getId() == id) {
				return editora;
			}
		}		
		return null;
	}
	@RequestMapping("api/editoras")
	public List<Editora> listaEdittoras(){	
		return listEditora;		
	}
	
	@RequestMapping(value="/api/editoras/{id}", method=RequestMethod.DELETE)
	public List<Editora> deleteEditora(@PathVariable("id") Long id) {	
		for (Editora editora : listEditora) {
			if (editora.getId() == id) {
				listEditora.remove(editora);
				return listEditora;
			}
		}		
		return null;
	}
	@RequestMapping(value="/api/editoras/{id}", method=RequestMethod.PUT)
	public Editora updateEditora(@PathVariable("id") Long id, @RequestParam String nome) {	
		for (Editora editora : listEditora) {
			if (editora.getId() == id) {
				
				editora.setNome(nome);
				
				return editora;
			}
		}		
		return null;
	}


}
