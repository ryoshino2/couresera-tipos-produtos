
public class ProdutoComTamanho extends Produto{

	private Integer tamanho;
	
	public ProdutoComTamanho(int codigoProduto, String nome, double preco, int tamanho) {
		super(codigoProduto, nome, preco);
		this.tamanho = tamanho;
	}
	
	@Override
	public boolean equals(Object produto) {
		  if (!(produto instanceof ProdutoComTamanho)) // Verifica se o tipo de objeto passado é do tipo ProdutoComTamanho
		    return false;
		  ProdutoComTamanho outroProduto = (ProdutoComTamanho) produto;
		  
		 // compara os hashCode
		  if (this.hashCode() == outroProduto.hashCode())
			  return true;
		  else 
			  return false;
	}
	
	public int hashCode() {
		int multHash = 3;
		int result = 0;
		result = this.getCodigoProduto() + (this.tamanho *multHash);
		return result;
	}
}
