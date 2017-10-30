package implementacao;

public class OrdemVarejo extends Ordem{

	private final double VALORDESCONTO = 5;
	
	@Override
	public void calcularPreco(Pedido pedido) {
		for(ItemPedido item : pedido.getItensDoPedido()) {
			Produto produto = item.getProduto();
			Integer quantidade = item.getQuantidade();
			setPrecoTotalDoPedido(getPrecoTotalDoPedido() + (produto.getPreco() * quantidade));
		}
	}

	@Override
	public void aplicarDesconto() {
		double totalComDesconto = getPrecoTotalDoPedido() - ((getPrecoTotalDoPedido() / 100) * VALORDESCONTO);
		setPrecoTotalDoPedido(totalComDesconto);
	}

}