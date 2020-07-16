import junit.framework.*;

public class CalculatriceTest extends TestCase {
	
	@Test
	public void testAdd() throws Exception {
		assertEquals(2, Calculatrice.add(1,1));
	}
	
	@Test
	public void testSub() {
		assertEquals(0, Calculatrice.sub(1,1));
	}

	@Test
	public void testMul() {
		assertEquals(1, Calculatrice.mul(1,1));
	}

	@Test
	public void testDiv() {
		assertEquals(1, Calculatrice.mul(1,1));
	}

}


