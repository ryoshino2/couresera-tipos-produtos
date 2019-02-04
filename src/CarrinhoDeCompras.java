import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private Map<Produto, Integer> carrinho = new HashMap<>();
	private static int quantidadeNoCarrinho;
	private static double total= 0;
	
	public void adicionaProduto(Produto produto, int quantidade){
		if (carrinho.containsKey(produto)){
			carrinho.put(produto, quantidade+=quantidade);
		}
		else carrinho.put(produto, quantidade);
		quantidadeNoCarrinho += quantidade;
	}

	public void removeProduto(Produto p, int quantidade){
		if (carrinho.containsKey(p)){
			carrinho.remove(p);
			quantidadeNoCarrinho -= quantidade;
		}
	}
	
// Metodo para retornar o preço total da compra no carrinho
	public double getPrecoTotalCarrinho(){
		for(Produto p : carrinho.keySet() ){
			total = p.getPreco() * quantidadeNoCarrinho;
		}
		return total;
	}
	
	public HashMap<Produto, Integer> getCarrinho() {
		return (HashMap<Produto, Integer>) carrinho;
	}

	public static int getQuantidadeNoCarrinho() {
		return quantidadeNoCarrinho;
	}
}
