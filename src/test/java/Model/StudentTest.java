package Model;

import java.util.Arrays;
import Model.Teacher;
import Model.Course;
import Model.Person;
import Model.Student;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void addCourse() {Person person1 = new Person("Laura","Baritiu");
        Student student1 = new Student("Mircea", "Manu",1234567);
        Student student2 = new Student("Mina", "Crisan",1234568);
        Teacher teacher1 = new Teacher("Mihai", "Ion", Arrays.asList());
        Course course1 = new Course("Alex",person1,35,Arrays.asList(student1));
        Course course2 = new Course("Matei",person1,29,Arrays.asList(student2));

        assertEquals(student.addCourse(course1,course2),2);

    }
}