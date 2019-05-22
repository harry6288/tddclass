package tddclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoftwareTest {
SoftwareSales s;
	@Before
	public void setUp() throws Exception {
		s = new SoftwareSales();
	}

	@After
	public void tearDown() throws Exception {
	}
// R1: buy one software package
	@Test
	public void testBuyOneSoftwarePackage() {
		
		double finalPrice = s.calculatePrice(2);
		assertEquals(198, finalPrice,0);
	}
	//R2
	@Test
	public void testBuy10Packages() {
		
		double finalPrice = s.calculatePrice(12);
		assertEquals(950.4,finalPrice,0);
	}
	//R3
		@Test
		public void testBuy20Packages() {
			
			double finalPrice = s.calculatePrice(30);
			assertEquals(2079,finalPrice,0);
		}
		//r4
		@Test
		public void testBuy50Packages() {
			double finalPrice = s.calculatePrice(60);
			assertEquals(3564,finalPrice,0);
		}
		//r5
		@Test
		public void testBuy100Packages() {
			double finalPrice = s.calculatePrice(120);
			assertEquals(5940,finalPrice,0);
		}
		
	

}
