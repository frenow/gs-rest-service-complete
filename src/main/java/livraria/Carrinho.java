package livraria;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private long id;
	private List<Livro> listLivros = new ArrayList<Livro>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Livro> getListLivros() {
		return listLivros;
	}
	public void setListLivros(List<Livro> listLivros) {
		this.listLivros = listLivros;
	}
	public Carrinho(long id, List<Livro> listLivros) {
		this.id = id;
		this.listLivros = listLivros;
	}

	

}
