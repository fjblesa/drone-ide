package externalutils;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import enums.Directions;
import exceptions.IllegalIdentifierException;
import exceptions.NotExistCoordinatesException;
import externalutils.ExternalOperations;
import externalutils.ExternalOperationsImpl;

// This test is only to validate a correct functioning to the Mock external functions
public class ExternalOperationsImplTest {
	
	private static ExternalOperations externalOperations;
	private static final Double COORDINATE_X = 38.56889;
	private static final Double COORDINATE_Y = 40.511107;
	private static final Integer IDENTIFIER = 5;
	private static final Integer UPIDENTIFIER = 6;
	private static final Double FIFTY = new Double("50");
	private static final Double SIXTY_NINE = new Double("69");
	
	@BeforeClass
	public static void setUp(){
		externalOperations = new ExternalOperationsImpl();
	}

	@Test
	public void getIdUrbanizationRetrievedStaticId() {
		Integer identifier = externalOperations.getIdUrbanization(COORDINATE_X, COORDINATE_Y);
		assertEquals(IDENTIFIER, identifier);
	}
	
	@Test(expected = NotExistCoordinatesException.class)
	public void getIdUrbanizationWithNotExistCoordinatesThrowException() {
		externalOperations.getIdUrbanization(FIFTY, SIXTY_NINE);
	}
	
	@Test
	public void getAdjacentRetrievedIdentifierPlusDirection(){
		Integer upIdentifier = externalOperations.getAdjacent(5, Directions.UP);
		
		assertEquals(UPIDENTIFIER, upIdentifier);
	}
	
	@Test (expected = IllegalIdentifierException.class)
	public void getAdjacentWithNegativeIdentifierThrowException(){
		externalOperations.getAdjacent(-1, Directions.UP);
	}
}
