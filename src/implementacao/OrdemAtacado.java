package implementacao;

public class OrdemAtacado extends Ordem{

	private final double VALORDESCONTO = 20;
	
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
