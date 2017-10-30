package implementacao;

public class EntregaExpressa implements TipoEntrega{

	/**
	 * Apenas um critério qualquer que simula o calculo de valor de uma entrega
	 */
	@Override
	public double calcularEntrega(double precoTotalDoPedido) {
		if(precoTotalDoPedido > 300) {
			return 200;
		}
		return 100;
	}

}
