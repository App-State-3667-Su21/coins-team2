import java;

public class CoinsTest {
	
	USCoinFactory uscf = USCoinFactory.getInstance();
	CADCoinFactory cdcf = CADCoinFactory.getInstance();

	@BeforeEach
	void emptyTest(){};

	@Test
	public void testNullCoin() {};

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void usCoinValue() {};

	// Test all cad coins with multiple assertEquals in this method.
	@Test
	public void cadCoinValue(){};

	@Test
	public void testUSName() {};

	@Test
	public void testCADName(){};

	@Test
	public void testUSSmelt(){}};

	@Test
	public void tesCADSmelt(){};

	
}
