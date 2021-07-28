import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CADCoinsTest {
	
	CADCoinFactory cdcf = CADCoinFactory.getInstance();

	@Test
	public void testNullCoin() {};

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void testDenomination() {
		double[] coinVals = {.05, .1, .25, .5, 1.0, 2.0};
		for (double expectedVal : coinVals ) {
			Coin c = cdcf.createCoin(expectedVal);
			double testVal = c.getDenomination();

			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}

	// Test all cad coins with multiple assertEquals in this method.
	@Test
	public void testGetName() {
		double[] coinVals = {.05, .1, .25, .5, 1.0, 2.0};
		String[] coinNames = {"Nickel", "Dime", "Quarter", "FiftyCent", "Loonie", "Toonie"};
		for (int i = 0; i < coinVals.length; i++) {
			String expectedVal = coinNames[i];
			Coin c = cdcf.createCoin(coinVals[i]);
			String testVal = c.getName();
			 
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}


    @Test
    public void testGetCountryCode() {
        String expectedVal = "CAD";
		double[] coinVals = {.05, .1, .25, .5, 1.0, 2.0};
        for (double cV : coinVals) {
            Coin c = uscf.createCoin(cV);
            String testVal = c.getCountryCode();
            
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
        }
    }
	
}
