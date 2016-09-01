package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
	public static final String MESSAGE_POSTALCODE_CONSTRAINTS = "Postalcode can be in any format";
	public static final String POSTALCODE_VALIDATION_REGEX = ".+";
	public String value;
	
	public PostalCode(String postalcode) throws IllegalValueException{
		if (!isValidPostalcode(postalcode)) {
            throw new IllegalValueException(MESSAGE_POSTALCODE_CONSTRAINTS);
        }
        this.value = postalcode;
	}
	
	public boolean isValidPostalcode(String test){
		return test.matches(POSTALCODE_VALIDATION_REGEX);
	}
	public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }
	
	public String toString() {
        return value;
    }
}
