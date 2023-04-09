package Webinars.Webinar3.group;

import Webinars.Webinar3.student.Student;

import java.util.Iterator;
import java.util.List;
public interface Group extends Iterable<Student> {
    void addStudent(Student student);
    List<Student> getStudentList();
}
