package exceptions;

/**
 * Exception for a illegal urbanization identifier.
 * @author Fran
 *
 */
public class IllegalIdentifierException extends DroneException {

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Unknown identifier, please try again with another identifier";

	public IllegalIdentifierException() {
		setMessage(MESSAGE);
	}
}
