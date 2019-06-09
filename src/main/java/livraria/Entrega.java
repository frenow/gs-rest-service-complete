package livraria;

public class Entrega {
	private Pedido pedido;
	private String data;
	private boolean entregue;
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean isEntregue() {
		return entregue;
	}
	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}
	public Entrega(Pedido pedido, String data, boolean entregue) {
		this.pedido = pedido;
		this.data = data;
		this.entregue = entregue;
	}
	
	

}
