
public class Produto {
	private String nome;
	private Integer codigoProduto;
	private Double preco;
		
	public Produto (int codigoProduto, String nome, double preco) {
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public Integer getCodigoProduto() {
		return codigoProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public boolean equals(Object produto){
		if (!(produto instanceof Produto)) { // Verificar se o tipo de objeto cadastrado é do tipo Produto
			return false;
		}
		Produto outroProduto = (Produto) produto;
		if (this.hashCode() == outroProduto.hashCode())
			return true;
				else 
					return false;
    }

	public int hashCode() {	
		int result = 0;
		result = codigoProduto;
		return result;
	}
}
