import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class USDCoinsTest {
	
	USDCoinMint uscf;
	double[] coinVals = {.01, .05, .1, .25, .5, 1.0};

	@BeforeEach
	public void init() {
		uscf = new USDCoinMint();
	}


	//@Test
	//public void testNullCoin() {};

	// Test all us coins with multiple assertEquals in this method.
	@Test
	public void testGetDenomination() {
		for (double expectedVal : coinVals ) {
			Coin c = uscf.createCoin(expectedVal);
			double testVal = c.getDenomination();

			assertEquals(testVal, expectedVal, .00010);
		}
	}

	//Test all US coin names
	/*
    @Test
	public void testGetName() {
		double[] coinVals = {.01, .05, .1, .25, .5, 1.0};
		String[] coinNames = {"Penny", "Nickel", "Dime", "Quarter", "HalfDollar", "Dollar"};
		for (int i = 0; i < cointVals.length; i++) {
			String expectedVal = coinNames[i];
			Coin c = uscf.createCoin(coinVals[i]);
			String testVal = c.getName();
			 
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
		}
	}
    */
    
    @Test
    public void testGetCountryCode() {
        String expectedVal = "USD";
        for (double cV : coinVals) {
            Coin c = uscf.createCoin(cV);
            String testVal = c.getCountryCode();
            
			assertEquals(testVal, expectedVal, 
			"Expected: " + expectedVal 
			+ ", but got: " + testVal);
        }
    }

}

