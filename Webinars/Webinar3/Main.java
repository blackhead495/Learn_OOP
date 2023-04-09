package Webinars.Webinar3;

import Webinars.Webinar3.group.Group;
import Webinars.Webinar3.group.StudyGroup;
import Webinars.Webinar3.student.Student;
public class Main {
    public static void main(String[] args) {
        Group group = new StudyGroup();
        Service service = new Service(group);
        service.addStudent("Паша");
        service.addStudent("Маша");
        service.addStudent("Даша");
        service.addStudent("Наташа");

//        Iterator<student.Student> iterator = group.iterator();
//        while (iterator.hasNext()){
//            student.Student student = iterator.next();
//            System.out.println(student);
//        }
        for (Student student : group) {
            System.out.println(student);
        }

        service.sortByName();
        System.out.println();
        System.out.println();

        for (Student student : group) {
            System.out.println(student);
        }

        service.sortById();
        System.out.println();
        System.out.println();

        for (Student student : group) {
            System.out.println(student);
        }
    }
}
