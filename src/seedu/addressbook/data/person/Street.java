package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
	public static final String MESSAGE_STREET_CONSTRAINTS = "Street can be in any format";
	public static final String STREET_VALIDATION_REGEX = ".+";
	public String value;
	
	public Street(String street) throws IllegalValueException{
		if (!isValidStreet(street)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.value = street;
	}
	
	public boolean isValidStreet(String test){
		return test.matches(STREET_VALIDATION_REGEX);
	}
	
	public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.value.equals(((Street) other).value)); // state check
    }
	
	public String toString() {
        return value;
    }
}
