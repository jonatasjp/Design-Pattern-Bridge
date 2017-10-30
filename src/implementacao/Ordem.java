package implementacao;

public abstract class Ordem {

	private TipoEntrega tipoEntrega;
	private double precoTotalDoPedido = 0;

	public double calcularTotal(Pedido pedido) {
		this.calcularPreco(pedido);
		precoTotalDoPedido += tipoEntrega.calcularEntrega(precoTotalDoPedido);
		aplicarDesconto();
		return precoTotalDoPedido;
	}

	public abstract void calcularPreco(Pedido pedido);
	
	public abstract void aplicarDesconto();

	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public double getPrecoTotalDoPedido() {
		return precoTotalDoPedido;
	}

	public void setPrecoTotalDoPedido(double precoTotalDoPedido) {
		this.precoTotalDoPedido = precoTotalDoPedido;
	}

}
