package seedu.addressbook.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class UtilsTest {
	
	@Test
	public void testisAnyNull(){
		List<String> _list = new ArrayList<String>();
		_list.add("1");
		_list.add("2");
		_list.add("3");
		
		assertEquals(false,Utils.isAnyNull(_list));
	}

	@Test
	public void testelementsAreUnique(){
		List<String> _list = new ArrayList<String>();
		_list.add("1");
		_list.add("2");
		_list.add("3");
		_list.add("1");
		
		assertEquals(false,Utils.elementsAreUnique(_list));
	}

}
