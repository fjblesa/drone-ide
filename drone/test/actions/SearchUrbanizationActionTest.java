package actions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import actions.SearchUrbanizationAction;
import actions.SearchUrbanizationActionImpl;
import externalutils.ExternalOperations;
import externalutils.ExternalOperationsImpl;

public class SearchUrbanizationActionTest {

	private static final Double COORDINATE_X = 38.56889;
	private static final Double COORDINATE_Y = 40.511107;
	private static final Integer RANGE_ONE = 1;
	private static final Integer RANGE_TWO = 2;
	private static List<Integer> listOne = new ArrayList<>();
	private static List<Integer> listTwo = new ArrayList<>();
	private static SearchUrbanizationAction searchAction;
	private static ExternalOperations externalOperation;

	@BeforeClass
	public static void setUp() {
		Integer[] arrayOne = { 5, 6, 7, 9, 10, 11, 8, 9, 10 };
		listOne = Arrays.asList(arrayOne);

		Integer[] arrayTwo = { 5, 6, 7, 7, 9, 9, 10, 11, 11, 13, 13, 14, 15, 15, 17, 8, 9, 10, 10, 12, 11, 12, 13, 13,
				15 };
		listTwo = Arrays.asList(arrayTwo);
		externalOperation= new ExternalOperationsImpl();
		searchAction = new SearchUrbanizationActionImpl(externalOperation);
	}

	@Test
	public void getByOneRangeRetrievedListOfAdjacentUrbanizationsRangeOne() {

		List<Integer> listUrbanizations = searchAction.getUrbanizations(COORDINATE_X, COORDINATE_Y, RANGE_ONE);
		for (int i = 0; i < listUrbanizations.size(); i++) {
			assertEquals(listOne.get(i), listUrbanizations.get(i));
		}
	}

	@Test
	public void getByOneRangeRetrievedListOfAdjacentUrbanizationsRangeTwo() {

		List<Integer> listUrbanizations = searchAction.getUrbanizations(COORDINATE_X, COORDINATE_Y, RANGE_TWO);
		for (int i = 0; i < listUrbanizations.size(); i++) {
			assertEquals(listTwo.get(i), listUrbanizations.get(i));
		}
	}
}
