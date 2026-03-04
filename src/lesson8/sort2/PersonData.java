package lesson8.sort2;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator

/**
 * Processes person data. Makes use of an external NameComparator class
 */
public class PersonData {
    public static Person[] prepareData() {
        Person[] persons =
                {new Person("Joe", "Brown", 4566.56),
                        new Person("Bob", "Roth", 3455.23),
                        new Person("Anne", "Mary", 6788.90),
                        new Person("Tim", "Cook", 2345.67),
                        new Person("Rosy", "Cook", 4567.88)};
        return persons;
    }

    public static void main(String[] args) {
        Person[] persons = prepareData();
        // Outside Name Comparator
        PersonData personData = new PersonData();
        System.out.println("Before Sorting: " + Arrays.toString(persons));
        PersonLastNameComparator compare = personData.getInner();
        Arrays.sort(persons, compare);

        System.out.println("After Sorting: " + Arrays.toString(persons));

    }

    private class PersonLastNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getFname().compareTo(p2.getFname());
        }
    }

    public PersonLastNameComparator getInner(){
        return new PersonLastNameComparator();
    }
}
