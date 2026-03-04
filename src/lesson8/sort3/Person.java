package lesson8.sort3;

import java.util.Comparator;

public class Person {
    private String fname;
    private String lname;
    private double salary;

    public Person(String n, String l, double salary) {
        fname = n;
        lname = l;
        this.salary = salary;
    }

    public String getFname() {
        return fname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return fname + " " + lname;
    }

    static class PersonInsidePersonNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p2, Person p1) {
            return p1.getFname().compareTo(p2.getFname());
        }
    }

}
