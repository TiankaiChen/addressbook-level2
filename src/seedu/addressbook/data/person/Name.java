package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a Person's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidName(String)}
 */
public class Name {

    public static final String EXAMPLE = "John Doe";
    public static final String MESSAGE_NAME_CONSTRAINTS = "Person names should be spaces or alphabetic characters";
    public static final String NAME_VALIDATION_REGEX = "[\\p{Alpha} ]+";

    public final String fullName;

    /**
     * Validates given name.
     *
     * @throws IllegalValueException if given name string is invalid.
     */
    public Name(String name) throws IllegalValueException {
        name = name.trim();
        if (!isValidName(name)) {
            throw new IllegalValueException(MESSAGE_NAME_CONSTRAINTS);
        }
        this.fullName = name;
    }

    /**
     * Returns true if a given string is a valid person name.
     */
    public static boolean isValidName(String test) {
        return test.matches(NAME_VALIDATION_REGEX);
    }

    /**
     * Retrieves a listing of every word in the name, in order.
     */
    public List<String> getWordsInName() {
        return Arrays.asList(fullName.split("\\s+"));
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Name // instanceof handles nulls
                && this.fullName.equals(((Name) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }
    
    /**
     * Returns true of the other name is very similar to this name.
     * Two names are considered similar if ...
     */
     public boolean isSimilar(Name other) {
    	 
    	 //test for NULL
    	 if(other == null){
    		 return false;
    	 }
    	 
    	 //test for different case
    	 String test_other = other.fullName.toLowerCase();
    	 String test_local = this.fullName.toLowerCase();
    	 if(test_other != test_local){
    		 return false;
    	 }
    	 
    	 //test for different order
    	 final Set<Object> testSet = new HashSet<>();
    	 for(String i: (test_other.split(" "))){
    		 testSet.add(i);
    	 }
    	 int count = 0;
    	 int total = testSet.size();
    	 for(String i: (test_other.split(" "))){
    		 if(!testSet.add(i)){
    			 count++;
    		 }
    	 }
    	 
    	 if(count != total){
    		 return false;
    	 }
    	 
    	 return true;
     }
    

}
