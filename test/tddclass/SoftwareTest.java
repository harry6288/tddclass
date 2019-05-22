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
		double finalPrice = s.calculatePrice(2);
		assertEquals(198, finalPrice,0);
	}
	//R2
	@Test
	public void testBuy10Packages() {
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(12);
		assertEquals(950.4,finalPrice,0);
	}
	//R3
		@Test
		public void testBuy20Packages() {
			SoftwareSales s = new SoftwareSales();
			double finalPrice = s.calculatePrice(30);
			assertEquals(2079,finalPrice,0);
		}
	

}
