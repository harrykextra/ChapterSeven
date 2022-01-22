package Chap7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesCommissionTest {
	SalesCommission nta;

	@BeforeEach
	void setUp() throws Exception {
		nta = new SalesCommission();
	}

	@Test
	void test() {
		assertNotNull(nta);
	}
	
	@Test
	void testArrayMethods() {
		assertEquals(3000, nta.getGrossSales(5));
	}
	
	@Test
	void testGetSalaryMethod() {
		assertEquals(384, nta.getSalary(0));
	}

}
