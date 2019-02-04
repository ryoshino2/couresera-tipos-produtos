import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeProduto {

	@Test
	public void testeEquals() {
			Produto p = new Produto(2, "Camiseta", 30);
			Produto p1 = new Produto(2, "Calça", 32);
			assertEquals(p.equals(p1), p1.equals(p));
	}
	
	@Test
	public void testeHashCode()	{
		Produto pt = new Produto(2, "Camiseta", 30);
		Produto pt1 = new Produto(2, "Blusa", 32);
		assertEquals(pt.hashCode(), pt1.hashCode());
	}
}