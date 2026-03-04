package lesson8.sort1;

import java.util.Comparator;

public class PersonFirstnameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.getFname().compareTo(p2.getFname());
    }
}
