package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {

	public boolean _edit; // true is for added, false is for deleted
	public Person _person;
	public Tag _tag;
	
	public Tagging(Person p, Tag t, boolean e){
		_person = p;
		_tag = t;
		_edit = e;
	}
	
	public String toString(){
		String edit;
		if(_edit){
			edit = "+ ";
		}else{
			edit = "- ";
		}
		
		return edit + _person.toString() + _tag.toString();
	}
	
}
