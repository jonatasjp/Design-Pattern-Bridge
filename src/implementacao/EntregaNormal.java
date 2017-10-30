package implementacao;

public class EntregaNormal implements TipoEntrega{

	/**
	 * Apenas um critério qualquer que simula o calculo de valor de uma entrega
	 */
	@Override
	public double calcularEntrega(double precoTotalDoPedido) {
		if(precoTotalDoPedido > 300) {
			return 100;
		}
		return 50;
	}

}
