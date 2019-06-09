package livraria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
	Pedido pedido;
	public PedidoController() {
	    List<Livro> listLivros = new ArrayList<Livro>();
	    List<Comentario> listComentarios = new ArrayList<Comentario>();
		
	    listComentarios.add(new Comentario(1, "Livro muito bom."));
		listComentarios.add(new Comentario(2, "Livro bom."));
		listComentarios.add(new Comentario(3, "Livro ruim."));
		
		listLivros.add(new Livro(1, "Senhor dos Aneis", 10,	new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),listComentarios));
		listLivros.add(new Livro(2, "Senhor dos Aneis", 15, new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),listComentarios));
		listLivros.add(new Livro(3, "Senhor dos Aneis", 20, new Autor(1, "Joao"),new Categoria(1, "Acao"),new Editora(2, "Grupo Planeta"),listComentarios));	
		
		
		pedido = new Pedido(90001, "01/06/2019", 200, listLivros);
	}
	
	@RequestMapping("api/pedidos")
	public Pedido listaPedido(){	
		return pedido;		
	}


}
