package enums;

/**
 * All directions to moving.
 * @author Fran
 *
 */
public enum Directions {
	UP(1),
	DOWN(2),
	LEFT(3),
	RIGHT(4);
	private Integer value;
	
	Directions(Integer value){
		this.setValue(value);
	}

	public Integer getValue() {
		return value;
	}

	private void setValue(Integer value) {
		this.value = value;
	}
}
