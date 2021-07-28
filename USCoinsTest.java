import java;

public class CoinsTest {
	
	USCoinFactory uscf; = USCoinFactory.getInstance();
	CADCoinFactory cdcf = CADCoinFactory.getInstance();

	@BeforeEach
	void emptyTest() {
		
	}

	@Test
	public void testNullCoin() {};

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void usCoinValue() {
		double[] coinVals = {.01, .05, .1, .25, .5, 1.0};
		for (double expectedVal : coinVals ) {
			Coin c = uscf.makeCoin(expectedVal);
			double testVal = c.getValue();

			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}

	// Test all cad coins with multiple assertEquals in this method.
	@Test
	public void testUSName() {
		double[] coinVals = {.01, .05, .1, .25, .5, 1.0};
		String[] coinNames = {"Penny", "Nickel", "Dime", "Quarter", "HalfDollar", "Dollar"};
		for (int i = 0; i < cointVals.length; i++) {
			String expectedVal = coinNames[i];
			Coin c = uscf.makeCoin(coinVals[i]);
			String testVal = c.getName();
			 
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}


	
}
