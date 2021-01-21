package java11.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest{

	public static void main(String[] args) {
		Person p1 = new Person("Necmi", "Kilic");
		Person p2 = new Person("Necmi", "Atmaca");
		Person p3 = new Person("Nurten", "Kilic");
		Person p4 = new Person("Ercan", "Aslan");
		Person p5 = new Person("Ramazan", "Asker");
		Person p6 = new Person("Bedriye", "Anne");
		
		List<Person> pList = new ArrayList<>(List.of(p1,p2,p3,p4,p5,p6));
		System.out.println(pList);
		Collections.sort(pList);
		System.out.println(pList);
	}

}

class Person implements Comparable<Person>{
	private String name;
	private String surname;
	

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	@Override
	public int compareTo(Person o) {
		int nameComp = this.name.compareTo(o.name);
		if (nameComp == 0) {
			nameComp = this.surname.compareTo(o.surname);
		}
		return nameComp;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

}
