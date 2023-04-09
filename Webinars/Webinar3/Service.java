package Webinars.Webinar3;

import Webinars.Webinar3.group.Group;
import Webinars.Webinar3.group.comparators.StudentComparatorById;
import Webinars.Webinar3.group.comparators.StudentComparatorByName;
import Webinars.Webinar3.student.Student;
public class Service {
    private int id;
    private Group group;

    public Service(Group group) {
        this.group = group;
    }

    public void addStudent(String name){
        Student student = new Student(id++, name);
        group.addStudent(student);
    }

    public void sortByName(){
        group.getStudentList().sort(new StudentComparatorByName());
    }

    public void sortById(){
        group.getStudentList().sort(new StudentComparatorById());
    }
}
