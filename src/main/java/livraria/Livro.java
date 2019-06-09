package livraria;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private long id;
    private String nome;
    private float valor;
    private Autor autor;
    private Categoria categoria;
    private Editora editora;
    private List<Comentario> listComentario = new ArrayList<Comentario>();
    
	public List<Comentario> getListComentario() {
		return listComentario;
	}

	public void setListComentario(List<Comentario> listComentario) {
		this.listComentario = listComentario;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public float getValor() {
		return valor;
	}

	public Livro(long id, String nome, float valor, Autor autor, Categoria categoria, Editora editora,
			List<Comentario> listComentario) {

		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.autor = autor;
		this.categoria = categoria;
		this.editora = editora;
		this.listComentario = listComentario;
	}

   

}
