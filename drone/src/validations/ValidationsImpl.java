package validations;

import exceptions.InvalidRangeException;

/**
 * Implementation for validations
 * @author Fran
 *
 */
public class ValidationsImpl implements Validations {

	/* (non-Javadoc)
	 * @see validations.Validations#validateRange(java.lang.Integer)
	 */
	@Override
	public void validateRange(Integer range) {
		if(range == null || range <= 0)
			throw new InvalidRangeException();
	}
}
