package livraria;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private long numero;
	private String data;
	private float total;
	private List<Livro> listLivros = new ArrayList<Livro>();
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public List<Livro> getListLivros() {
		return listLivros;
	}
	public void setListLivros(List<Livro> listLivros) {
		this.listLivros = listLivros;
	}
	public Pedido(long numero, String data, float total, List<Livro> listLivros) {
		this.numero = numero;
		this.data = data;
		this.total = total;
		this.listLivros = listLivros;
	}
	
	
}
