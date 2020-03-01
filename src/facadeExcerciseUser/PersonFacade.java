package facadeExcerciseUser;

import java.util.List;

public class PersonFacade {
    public Student addStudent(String firstName, String lastName, String course) {
        return new Student.StudentBuilder(firstName, lastName, course).build();
    }

    public Teacher addTeacher(String firstName, String lastName, List<String> blocks) {
        return new Teacher.TeacherBuilder(firstName, lastName)
                .setBlocks(blocks)
                .build();
    }
}
