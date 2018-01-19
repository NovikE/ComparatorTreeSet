package by.htp.comp.runner;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import by.htp.comp.bean.Person;
import by.htp.comp.bean.PersonComparator;
import by.htp.comp.bean.PersonComparatorByAge;
import by.htp.comp.bean.PersonComparatorByLastName;

public class MainApp {

	public static void main(String[] args) {
		
		Comparator<Person> comparator = new PersonComparator().thenComparing(new PersonComparatorByAge());
		
		Comparator<Person> comparatorByLN = new PersonComparatorByLastName();
		
		Comparator<Person> comparatorByAge = new PersonComparatorByAge();
		
		Person per1 = new Person("Anna","Cimanenka", 29);
		Person per2 = new Person("Sergey","Kurnosov", 20);
		Person per3 = new Person("Anton","Prokopenko", 23);
		Person per4 = new Person("Vladimir","Mogulenko", 28);
		Person per5 = new Person("Olga","Cidarenka", 30);
		Person per6 = new Person("Svetlana","Klimova", 19);
		Person per7 = new Person("Pavel","Orlov", 27);
		Person per8 = new Person("Anna","Orlova", 27);
		
		Set<Person> set = new TreeSet<Person>(comparator);
		
		set.add(per1);
		set.add(per2);
		set.add(per3);
		set.add(per4);
		set.add(per5);
		set.add(per6);
		set.add(per7);
		set.add(per8);
		
		Iterator<Person> it = set.iterator();
		
		while (it.hasNext()) {
		Person s = it.next();
		System.out.println(s.getFirstName() + " " + s.getLastName()+" " + s.getAge());
		}
		

		Set<Person> set1 = new TreeSet<Person>(comparatorByLN);
		set1.add(per1);
		set1.add(per2);
		set1.add(per3);
		set1.add(per4);
		set1.add(per5);
		set1.add(per6);
		set.add(per7);
		set.add(per8);
		
		System.out.println("-----------------------");
		System.out.println("By Last Name:");
		
		Iterator<Person> it1 = set1.iterator();
		
		while (it1.hasNext()) {
		Person s = it1.next();
		System.out.println(s.getFirstName() + " " + s.getLastName()+" " + s.getAge());
		}
		
	}

}
