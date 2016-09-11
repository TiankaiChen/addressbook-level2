package seedu.addressbook.data.person;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
// created to test isSimilar function
	private Name NAME1;
	private Name NAME2;
	
	@Before
	public void setup() throws IllegalValueException{
		NAME1 = new Name("John K Smith");
		NAME2 = new Name("SMITh JoHn K");
	}
	
	@Test
	public void diffOrder_returnsTrue(){
		assertEquals(true, NAME1.isSimilar(NAME2));
	}
	
	@Test
	public void diffCase_returnsTrue(){
		assertEquals(true, NAME1.isSimilar(NAME2));
	}
	
}
