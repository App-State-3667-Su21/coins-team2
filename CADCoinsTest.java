import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CADCoinsTest {
	
	CADCoinFactory cdcf = CADCoinFactory.getInstance();

	@Test
	public void testNullCoin() {};

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void testCoinValue() {
		double[] coinVals = {.05, .1, .25, .5, 1.0, 2.0};
		for (double expectedVal : coinVals ) {
			Coin c = cdcf.makeCoin(expectedVal);
			double testVal = c.getValue();

			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}

	// Test all cad coins with multiple assertEquals in this method.
	@Test
	public void testCoinName() {
		double[] coinVals = {.05, .1, .25, .5, 1.0, 2.0};
		String[] coinNames = {"Nickel", "Dime", "Quarter", "FiftyCent", "Loonie", "Toonie"};
		for (int i = 0; i < cointVals.length; i++) {
			String expectedVal = coinNames[i];
			Coin c = cdcf.makeCoin(coinVals[i]);
			String testVal = c.getName();
			 
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}


	
}
