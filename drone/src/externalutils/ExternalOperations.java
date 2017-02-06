package externalutils;

import enums.Directions;

/**
 * External operations.
 * @author Fran
 *
 */
public interface ExternalOperations {

	/**
	 * This method is a external method. When called with all parameters, them return the urbanization identifier.
	 * 
	 * @param coordinateX
	 * @param coordinateY
	 * @return 
	 *       urbanization identifier.
	 */
	public Integer getIdUrbanization(Double coordinateX, Double coordinateY);
	
	/**
	 * This method is a external method. When called with all parameters, them return the identifier of the urbanization
	 * located at the requested address. 
	 * @param idOrigin
	 * @param direction
	 *        values (UP, DOWN, LEFT, RIGH)
	 * @return 
	 *        urbanization identifier.
	 */
	public Integer getAdjacent (Integer idOrigin, Directions direction);
}
