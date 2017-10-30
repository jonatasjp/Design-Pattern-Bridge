package implementacao;

public abstract class Ordem {

	private TipoEntrega tipoEntrega;

	public double calcularTotal(Pedido pedido) {
		double total = this.calcularPreco(pedido);
		total += tipoEntrega.calcularEntrega();
		return total;
	}

	public abstract double calcularPreco(Pedido pedido);

	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

}
