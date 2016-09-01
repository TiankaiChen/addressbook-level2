package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    
    private Block _block;
    private Street _street;
    private Unit _unit;
    private PostalCode _postalcode;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] data = splitAddress(address);
        _block = new Block(data[0]);
        _street = new Street(data[1]);
        _unit = new Unit(data[2]);
        _postalcode = new PostalCode(data[3]);
        
    }
    
    private String[] splitAddress(String address){
    	final String[] split = address.trim().split(", ");
    	return split;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return _block.toString() + ", " + _street.toString() + ", " + _unit.toString() + ", " + _postalcode.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this._block.equals(((Address) other)._block)
                && this._street.equals(((Address) other)._street)
                && this._unit.equals(((Address) other)._unit)
                && this._postalcode.equals(((Address) other)._postalcode)); // state check
    }

    @Override
    public int hashCode() {
    	String value = this.toString();
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}