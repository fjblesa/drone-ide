package exceptions;

/**
 * General exception for Drone.
 * @author Fran
 *
 */
public class DroneException extends RuntimeException{
	 
	private static final long serialVersionUID = 1L;
	
	private String messageException = "Server Error";
    
	@Override
	public String getMessage() {
		return messageException;
	}

	public void setMessage(String message) {
		this.messageException = message;
	}
}
