package exceptions;

/**
 * Exception for a invalid range.
 * @author Fran
 *
 */
public class InvalidRangeException extends DroneException{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Invalid range";
	
	public InvalidRangeException() {
		setMessage(MESSAGE);
	}
}
