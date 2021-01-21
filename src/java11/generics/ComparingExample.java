package java11.generics;

/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Comparator static methods
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Person class with firstName & lastName
class Person2 {
    private String firstName;
    private String lastName;

    // Constructor takes both arguments
    Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // toString method
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

// Sorting without using either a custom Comparator or a Comparable.
public class ComparingExample {
    public static void main(String[] args) {

        // Creating a list of person.
        List<Person2> people = new ArrayList<>(List.of(new Person2("George", "Ball"),
                new Person2("Cathy", "Hart"),
                new Person2("Anne", "Ball"),
                new Person2("Marty", "Hart")));

        // sort in a multi-dimensional way, using methods (getters here)
        // chaining the static methods on Comparator
        people.sort(
                Comparator.comparing(Person2::getLastName)
                        .thenComparing(
                                Comparator.comparing(Person2::getFirstName)));

        people.forEach(System.out::println);
    }
}