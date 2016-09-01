package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
	public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit can be in any format";
	public static final String UNIT_VALIDATION_REGEX = ".+";
	public String value;
	
	public Unit(String unit) throws IllegalValueException{
		if (!isValidUnit(unit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.value = unit;
	}
	
	public boolean isValidUnit(String test){
		return test.matches(UNIT_VALIDATION_REGEX);
	}
	
	public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }
	
	public String toString() {
        return value;
    }
}
