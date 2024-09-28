package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("MaksRuss", 1, 4.5);
        Student st2 = new Student("OlegKosar", 1, 3.5);
        Student st3 = new Student("SanjaEjik", 1, 4.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start method getStudents");
//        students.get(3);

        System.out.println("Method getStudent: ");
        System.out.println(students);
        return students;
    }
}
