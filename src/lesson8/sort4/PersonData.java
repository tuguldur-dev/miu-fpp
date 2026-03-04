package lesson8.sort4;

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
        System.out.println("Before Sorting: " + Arrays.toString(persons));
        MyLocalSort(persons);

    }

    public static void MyLocalSort(Person[] persons) {
        class PersonComparator implements Comparator<Person> {
            @Override
            public int compare(Person p1, Person p2) {
                return Double.compare(p1.getSalary(), p2.getSalary());
            }
        }

        PersonComparator personComparator = new PersonComparator();
        Arrays.sort(persons, personComparator);
        System.out.println("After Sorting: " + Arrays.toString(persons));
    }
}