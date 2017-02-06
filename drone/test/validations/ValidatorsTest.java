package validations;

import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.InvalidRangeException;
import validations.Validations;
import validations.ValidationsImpl;

public class ValidatorsTest {

	private final static Integer POSITIVERANGE = 2;
	private final static Integer NEGATIVERANGE = -2;
	private static Validations validator;
	
	@BeforeClass
	public static void setUp(){
		validator = new ValidationsImpl();
	}
	
	@Test
	public void validatePositiveRange() {
		validator.validateRange(POSITIVERANGE);
	}
	
	@Test(expected = InvalidRangeException.class)
	public void validateNegativeRangeThrowsException() {
		validator.validateRange(NEGATIVERANGE);
	}
	
	@Test(expected = InvalidRangeException.class)
	public void validateNullRangeThrowsException() {
		validator.validateRange(null);
	}
}
