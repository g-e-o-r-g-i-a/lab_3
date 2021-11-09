package Model;

import java.util.List;

public class Teacher extends Person {
    List<Course> courses;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, List<Course> courses) {
        super(firstName, lastName);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * adaug un curs in lista profesorului de cursuri
     * @param newCourse
     */
    public void addCourse(Course newCourse){
        courses.add(newCourse);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", courses=" +  courses +
                '}';
    }
}
