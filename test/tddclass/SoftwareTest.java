package tddclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftwareTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
// R1: buy one software package
	@Test
	public void testBuyOneSoftwarePackage() {
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(1);
		assertEquals(99, finalPrice,0);
	}

}