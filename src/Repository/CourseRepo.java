package Repository;

import Model.Course;

import java.util.List;

public class CourseRepo extends InMemoryRepo<Course> {

    List<Course> courses;

    /**
     * actualizez un curs cu unul ce mi se da ca parametru
     * @param curs
     * @return cursul actualizat
     */
    @Override
    public Course update(Course curs) {
        Course courseToUpdate = this.repoList.stream()
                .filter(course -> course.getClass() == curs.getClass())
                .findFirst()
                .orElseThrow();

        courseToUpdate.setCredits(curs.getCredits());
        courseToUpdate.setTeacher(curs.getTeacher());
        courseToUpdate.setStudentsEnrolled(curs.getStudentsEnrolled());
        courseToUpdate.setName(curs.getName());
        courseToUpdate.setMaxEnrollment(curs.getMaxEnrollment());

        return courseToUpdate;
    }
}
