import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class USDCoinMintTest {
	
	USDCoinMint uscm;

	@BeforeEach
	public void init() {
		uscm = new USDCoinMint();
	}

	// @Test
	// public void testCoinObj(){
		

	// 	double[] denoms = {0.01, 0.05, 0.1, 0.25, 0.5, 1.0};
	// 	Coin[] coins = {new Penny(), new Nickel(), new Dime(), new Quarter(), new HalfDollar(), new Dollar()};
	// 	for(int i = 0; i < denoms.length; i++) {
	// 		Coin c = uscm.createCoin(denom[i]);
	// 		assertTrue(c instanceof coins[i]);
	// 	}
	// }

	@Test
	public void testPenny() {
		Coin c = uscm.createCoin(.01);
		assertTrue(c instanceof Penny);
	}

	@Test void testNickel() {
		Coin c = uscm.createCoin(.05);
		assertTrue(c instanceof Nickel);
	}

	@Test
	public void testDime() {
		Coin c  = uscm.createCoin(.10);
		assertTrue(c instanceof Dime);
	}

	@Test
	public void testQuarter() {
		Coin c = uscm.createCoin(.25);
		assertTrue(c instanceof Quarter);
	}

	@Test
	public void testHalfDollar() {
		Coin c = uscm.createCoin(.5);
		assertTrue(c instanceof HalfDollar);
	}

	@Test 
	public void testDollar() {
		Coin c = uscm.createCoin(1.0);
		assertTrue(c instanceof Dollar);
	}

//	@Test
//	public void testSingleton(){
//		USDCoinMint uscm1 = USDCoinMint.getInstance();
//		USDCoinMint uscm2 = USDCoinMint.getInstance();
//
//		assertEquals(uscm1, uscm2);
//	}
}
