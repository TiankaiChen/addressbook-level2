package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact in the contact book.
 */
public class Contact {


    public final String value;
    private boolean isPrivate;
    
    /**
     * Validates given contact.
     *
     * @throws IllegalValueException if given contact string is invalid.
     */
    public Contact(String contact, boolean isPrivate, String MESSAGE_CONSTRAINTS, String VALIDATION_REGEX) throws IllegalValueException {
        this.isPrivate = isPrivate;
        contact = contact.trim();
        if (!(contact.matches(VALIDATION_REGEX))) {
            throw new IllegalValueException(MESSAGE_CONSTRAINTS);
        }
        this.value = contact;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}