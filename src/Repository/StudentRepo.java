package Repository;

import Model.Student;

import java.util.List;

public class StudentRepo extends InMemoryRepo<Student> {

    List<Student> students;

    /**
     * actualizez un student cu unul ce mi se da ca parametru
     * @param stud
     * @return studentul actualizat
     */
    @Override
    public Student update(Student stud) {
        Student studentToUpdate = this.repoList.stream()
                .filter(student -> student.getStudentID() == stud.getStudentID())
                .findFirst()
                .orElseThrow();

        studentToUpdate.setEnrolledCourses(stud.getEnrolledCourses());
        studentToUpdate.setTotalCredits(stud.getTotalCredits());
        studentToUpdate.setFirstName(stud.getFirstName());
        studentToUpdate.setLastName(stud.getLastName());

        return studentToUpdate;
    }
}

