package dev.seohee.functionalinterface.compare;

import java.util.Comparator;

// Comparator
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
