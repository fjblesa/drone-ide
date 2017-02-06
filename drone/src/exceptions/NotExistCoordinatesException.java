package exceptions;

/**
 * Exception for urbanization identifier with nonexistent coordinates. 
 * @author Fran
 *
 */
public class NotExistCoordinatesException extends DroneException {

	private static final long serialVersionUID = 1L;
    private static final String MESSAGE = "Not found coordinates in range";
	
    public NotExistCoordinatesException() {
		setMessage(MESSAGE);
	}
}
