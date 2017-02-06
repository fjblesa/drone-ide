package enums;

import static org.junit.Assert.*;

import org.junit.Test;

import enums.Directions;

public class EnumDirectionsTest {

	private static final Integer ONE = 1;
	private static final Integer TWO = 2;
	private static final Integer THREE = 3;
	private static final Integer FOUR = 4;
	
	@Test
	public void upTest() throws Exception {
		assertEquals(new Integer(ONE), Directions.UP.getValue());
	}
	
	@Test
	public void dawnTest() throws Exception {
		assertEquals(new Integer(TWO), Directions.DOWN.getValue());
	}
	
	@Test
	public void leftTest() throws Exception {
		assertEquals(new Integer(THREE), Directions.LEFT.getValue());
	}
	
	@Test
	public void righTest() throws Exception {
		assertEquals(new Integer(FOUR), Directions.RIGHT.getValue());
	}
}
