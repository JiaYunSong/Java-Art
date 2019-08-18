package test01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitATest {

	@Test
	void testA() {
		A obj=new A(5);
		assertEquals(obj.get(),5);
	}
	@Test
	void testSetGet() {
		A obj=new A(0);
		obj.set(6);
		assertEquals(obj.get(),6);
	}
	@Test
	void testGetSquare() {
		A obj=new A(7);
		assertEquals(obj.getSquare(),5);
	}
}
