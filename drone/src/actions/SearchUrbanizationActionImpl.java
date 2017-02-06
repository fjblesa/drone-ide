package actions;

import java.util.ArrayList;
import java.util.List;

import enums.Directions;
import externalutils.ExternalOperations;
import validations.Validations;
import validations.ValidationsImpl;

/**
 * Implementation to Search urbanization action.
 * 
 * @author Fran
 *
 */
public class SearchUrbanizationActionImpl implements SearchUrbanizationAction {

	private ExternalOperations externalOperations;

	public SearchUrbanizationActionImpl(ExternalOperations externalOperations) {
		this.externalOperations = externalOperations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see actions.SearchUrbanizationAction#getUrbanizations(java.lang.Double,
	 * java.lang.Double, java.lang.Integer)
	 */
	@Override
	public List<Integer> getUrbanizations(Double coordinateX, Double coordinateY, Integer range) {

		List<Integer> listUrbanizations = new ArrayList<>();
		Validations validator = new ValidationsImpl();
		validator.validateRange(range);

		Integer originUrbanizationId = externalOperations.getIdUrbanization(coordinateX, coordinateY);

		listUrbanizations.add(originUrbanizationId);
		listUrbanizations.addAll(getUrbanizationsUpAndDown(originUrbanizationId, range));
		listUrbanizations.addAll(getUrbanizationsLeftOrRight(originUrbanizationId, range, Directions.RIGHT));
		listUrbanizations.addAll(getUrbanizationsLeftOrRight(originUrbanizationId, range, Directions.LEFT));

		return listUrbanizations;
	}

	/**
	 * This method is responsible for moving to the right or left by a range and
	 * a source urbanization identifier. It also takes care of calling the
	 * function to move up and dawn.
	 * 
	 * @param originUrbanizationId
	 * @param range
	 * @param direction
	 * @return List of urbanizations identifiers.
	 */
	private List<Integer> getUrbanizationsLeftOrRight(Integer originUrbanizationId, Integer range,
			Directions direction) {

		Integer id = originUrbanizationId;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < range; i++) {
			id = externalOperations.getAdjacent(id, direction);
			list.add(id);
			list.addAll(getUrbanizationsUpAndDown(id, range));
		}

		return list;
	}

	/**
	 * This method is responsible for moving to up and dawn by range and a
	 * urbanization identifier.
	 * 
	 * @param urbanizationId
	 * @param range
	 * @return List of urbanizations identifiers.
	 */
	private List<Integer> getUrbanizationsUpAndDown(Integer urbanizationId, Integer range) {

		List<Integer> list = new ArrayList<>();
		Integer urbIdUp = urbanizationId;
		Integer urbIdDow = urbanizationId;

		for (int i = 1; i <= range; i++) {
			urbIdUp = externalOperations.getAdjacent(urbIdUp, Directions.UP);
			list.add(urbIdUp);
			urbIdDow = externalOperations.getAdjacent(urbIdDow, Directions.DOWN);
			list.add(urbIdDow);
		}

		return list;
	}
}
