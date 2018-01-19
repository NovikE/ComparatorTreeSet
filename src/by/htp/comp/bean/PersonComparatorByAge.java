package by.htp.comp.bean;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person>{
	
	public int compare(Person p1, Person p2){
	      
        if(p1.getAge()> p2.getAge())
            return 1;
        else if(p1.getAge()< p2.getAge())
            return -1;
        else
            return 0;
    }

}
