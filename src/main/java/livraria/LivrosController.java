package livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosController {
    private static final List<Livro> listLivros = new ArrayList<Livro>();
    private static final List<Comentario> listComentarios = new ArrayList<Comentario>();
	
	public LivrosController() {
		listComentarios.add(new Comentario(1, "Livro muito bom."));
		listComentarios.add(new Comentario(2, "Livro bom."));
		listComentarios.add(new Comentario(3, "Livro ruim."));
		
		listLivros.add(new Livro(1, "Senhor dos Aneis", 10,	new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),listComentarios));
		listLivros.add(new Livro(2, "Senhor dos Aneis", 15, new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),listComentarios));
		listLivros.add(new Livro(3, "Senhor dos Aneis", 20, new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),listComentarios));	
	}
    
	@RequestMapping(value="/api/livros/{id}", method=RequestMethod.GET)
	public Livro livro(@PathVariable("id") Long id) {
		for (Livro livro : listLivros) {
			if (livro.getId() == id) {
				return livro;
			}
		}		
		return null;
	}
	
	@RequestMapping("api/livros")
	public List<Livro> listaLivros(){	
		return listLivros;		
	}
	@RequestMapping(value="/api/livros/{id}", method=RequestMethod.DELETE)
	public List<Livro> deleteLivro(@PathVariable("id") Long id) {	
		for (Livro livro : listLivros) {
			if (livro.getId() == id) {
				listLivros.remove(livro);
				return listLivros;
			}
		}		
		return null;
	}
	@RequestMapping(value="/api/livros/{id}", method=RequestMethod.PUT)
	public Livro updateLivro(@PathVariable("id") Long id, @RequestParam String nome, @RequestParam float valor) {	
		for (Livro livro : listLivros) {
			if (livro.getId() == id) {
				
				livro.setNome(nome);
				livro.setValor(valor);
				
				return livro;
			}
		}		
		return null;
	}
	@RequestMapping(value="/api/livros", method=RequestMethod.POST)
	public Livro postLivro(@RequestParam long id ,@RequestParam String nome, @RequestParam float valor) {	
				Livro livro = new Livro(id, nome, valor, null, null, null, null);
				listLivros.add(livro);
				return livro;
	}
	
}
