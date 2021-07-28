import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class USCoinsTest {
	
	USCoinMint uscf = USCoinMint().getInstance();


	@Test
	public void testNullCoin() {};

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void testCoinValue() {
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
	public void testCoinName() {
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
