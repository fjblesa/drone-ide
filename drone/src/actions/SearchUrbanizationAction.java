package actions;

import java.util.List;

/**
 * Action for search the urbanizations 
 *  
 * @author Fran
 *
 */
@FunctionalInterface
public interface SearchUrbanizationAction {
	
	/**
	 * Search the identifiers of the urbanizations starting from a starting coordinates and a range
	 * 
	 * @param coordinateX
	 * @param coordinateY
	 * @param range
	 * @return
	 */
	List<Integer> getUrbanizations(Double coordinateX, Double coordinateY, Integer range);
}
