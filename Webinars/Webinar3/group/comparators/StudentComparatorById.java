package Webinars.Webinar3.group.comparators;

import Webinars.Webinar3.student.Student;
import java.util.Comparator;
public class StudentComparatorById implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
