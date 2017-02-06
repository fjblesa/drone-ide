package externalutils;

import enums.Directions;
import exceptions.IllegalIdentifierException;
import exceptions.NotExistCoordinatesException;

/**
 * Implementation to a External Operations
 * @author Fran
 *
 */
public class ExternalOperationsImpl implements ExternalOperations{

	private static final Double COORDINATE_X = 38.56889;
	private static final Double COORDINATE_Y = 40.511107;
	private static final Integer IDENTIFIER = 5;
	
 	/* (non-Javadoc)
	 * @see utils.ExternalOperations#getIdUrbanization(java.lang.Long, java.lang.Long)
	 * TODO This implementation is fictitious, since it is an external functionality, which in theory would be provided
	 */
	@Override
	public Integer getIdUrbanization(Double coordinateX, Double coordinateY) {
		if(coordinateX.equals(COORDINATE_X) && coordinateY .equals(COORDINATE_Y)){
			return IDENTIFIER;
		}
		throw new NotExistCoordinatesException();
	}

	/* (non-Javadoc)
	 * @see utils.ExternalOperations#getAdjacent(java.lang.Integer, java.lang.String)
	 * TODO This implementation is fictitious, since it is an external functionality, which in theory would be provided
	 */
	@Override
	public Integer getAdjacent(Integer idOrigin, Directions direction) {
		if(idOrigin<0){
			throw new IllegalIdentifierException();
		}
		
		return idOrigin + direction.getValue();
	}
}
