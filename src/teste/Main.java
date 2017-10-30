package teste;

import java.util.Arrays;

import implementacao.EntregaExpressa;
import implementacao.EntregaNormal;
import implementacao.ItemPedido;
import implementacao.Ordem;
import implementacao.OrdemAtacado;
import implementacao.OrdemVarejo;
import implementacao.Pedido;
import implementacao.Produto;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Violão", 155.25);
		Produto produto2 = new Produto("Guitarra", 552.75);
		Produto produto3 = new Produto("Bateria", 1255);
		
		ItemPedido item1 = new ItemPedido(produto1, 2);
		ItemPedido item2 = new ItemPedido(produto2, 2);
		ItemPedido item3 = new ItemPedido(produto3, 2);
		
		Pedido pedido = new Pedido();
		pedido.setItensDoPedido(Arrays.asList(item1, item2, item3));
		
		Ordem ordem1 = new OrdemAtacado();
		ordem1.setTipoEntrega(new EntregaExpressa());
		System.out.println(ordem1.calcularTotal(pedido));
		
		ordem1 = new OrdemAtacado();
		ordem1.setTipoEntrega(new EntregaNormal());
		System.out.println(ordem1.calcularTotal(pedido));
		
		Ordem ordem2 = new OrdemVarejo();
		ordem2.setTipoEntrega(new EntregaExpressa());
		System.out.println(ordem2.calcularTotal(pedido));
		
		ordem2 = new OrdemVarejo();
		ordem2.setTipoEntrega(new EntregaNormal());
		System.out.println(ordem2.calcularTotal(pedido));

		
	}
}
