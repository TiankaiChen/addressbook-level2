package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
	
	public static final String MESSAGE_BLOCK_CONSTRAINTS = "Block can be in any format";
	public static final String BLOCK_VALIDATION_REGEX = ".+";
	public String value;
	
	public Block(String block) throws IllegalValueException{
		if (!isValidBlock(block)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.value = block;
	}
	
	public boolean isValidBlock(String test){
		return test.matches(BLOCK_VALIDATION_REGEX);
	}
	
	public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.value.equals(((Block) other).value)); // state check
    }
	
	public String toString() {
        return value;
    }

}
