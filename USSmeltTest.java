import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class USSmeltTest {
	
	USDCoinMint uscm;
	Coin c;

	PrintStream origOut;
	ByteArrayOutputStream baos;
	PrintStream newOut;

	@BeforeEach
	public void init() {
		uscm = USDCoinMint.getInstance();
	}
	
	private void printPrep() {
		origOut = System.out;
		baos = new ByteArrayOutputStream();
		newOut = new PrintStream(baos);
		System.setOut(newOut);
	}

	private String getTestOutput() {
		System.out.flush();
		String testOutput = baos.toString();
		System.setOut(origOut);
		return testOutput;
	}


	@Test
	public void testPennySmelt() {
		c = uscm.createCoin(.01);
		String expectedResult = "Smelting Penny with 2.5% Cu and 97.5% Zn...completed.\n";
		printPrep();
		c.smelt();
		String testOutput = getTestOutput();

		assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	}

	@Test
	public void testNickelSmelt() {

	}

	
}
