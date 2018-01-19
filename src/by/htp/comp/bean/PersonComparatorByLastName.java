package by.htp.comp.bean;

import java.util.Comparator;

public class PersonComparatorByLastName implements Comparator<Person>{
	
	public int compare(Person p1, Person p2) {
				
		return p1.getLastName().compareTo(p2.getLastName());
		
	}
	

}
