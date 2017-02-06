package validations;

/**
 * For validations 
 * @author Fran
 *
 */
@FunctionalInterface
public interface Validations {

	/**
	 * To validate a range. If the validations is wrong throw exception
	 * 
	 * @param range
	 */
	public void validateRange(Integer range);
}
