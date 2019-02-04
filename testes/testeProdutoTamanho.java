import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeProdutoTamanho {

	@Test
	public void testeEquals() {
		Produto pt = new ProdutoComTamanho(1, "Bone", 20, 5);
		Produto pt1 = new ProdutoComTamanho(2, "Calça", 22, 15);
		assertEquals(pt.equals(pt1), pt1.equals(pt));
	}

	@Test
	public void testeHashCode()	{
		Produto pt = new ProdutoComTamanho(2, "Camisa", 25, 5);
		Produto pt1 = new ProdutoComTamanho(2,"Camisa", 30, 3);
		assertEquals(pt.hashCode(), pt1.hashCode());
	}
}
