package Webinars.Webinar3.group.comparators;

import Webinars.Webinar3.student.Student;
import java.util.Comparator;
public class StudentComparatorByName implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
