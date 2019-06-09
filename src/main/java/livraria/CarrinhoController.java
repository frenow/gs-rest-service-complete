package livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrinhoController {
	Carrinho carrinho;
	private static final List<Livro> listLivros = new ArrayList<Livro>();
	
	public CarrinhoController() {
		listLivros.add(new Livro(1, "Senhor dos Aneis", 10,	new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),null));
		listLivros.add(new Livro(2, "Senhor dos Aneis", 15, new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),null));
		listLivros.add(new Livro(3, "Senhor dos Aneis", 20, new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),null));	
		carrinho = new Carrinho(1,listLivros);
	}

	@RequestMapping("api/carrinho")
	public Carrinho carrinho(){	
		return carrinho;		
	}
}
