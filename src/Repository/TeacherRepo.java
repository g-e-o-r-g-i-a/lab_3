package Repository;

import Model.Teacher;

import java.util.List;

public class TeacherRepo extends InMemoryRepo<Teacher> {
    List<Teacher> teachers;

    /**
     * actualizez un profesor cu unul ce mi se da ca parametru
     * @param prof
     * @return profesorul actualizat
     */
    @Override
    public Teacher update(Teacher prof) {
        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> teacher.getClass() == prof.getClass())
                .findFirst()
                .orElseThrow();

        teacherToUpdate.setCourses(prof.getCourses());
        teacherToUpdate.setFirstName(prof.getFirstName());
        teacherToUpdate.setLastName(prof.getLastName());

        return teacherToUpdate;

    }
}
