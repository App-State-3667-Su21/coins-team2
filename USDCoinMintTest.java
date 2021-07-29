import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class USDCoinMintTest {
	
	@Test
	public void testCoinObj(){
		USDCoinMint uscm = new USDCoinMint();

		double[] denoms = {0.01, 0.05, 0.1, 0.25, 0.5, 1.0};
		Coin[] coins = {new Penny(), new Nickel(), new Dime(), new Quarter(), new HalfDollar(), new Dollar()};
		for(int i = 0; i < denoms.length; i++) {
			Coin c = uscm.createCoin(denom[i]);
			assertTrue(c instanceof coins[i]);
		}
	}

//	@Test
//	public void testSingleton(){
//		USDCoinMint uscm1 = USDCoinMint.getInstance();
//		USDCoinMint uscm2 = USDCoinMint.getInstance();
//
//		assertEquals(uscm1, uscm2);
//	}
}