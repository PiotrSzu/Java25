package facadeExcerciseUser;

import java.util.List;

public class Teacher extends Person {
    private List<String> blocks;

    public Teacher(TeacherBuilder builder) {
        super(builder.firstName, builder.lastName);
        this.blocks = builder.blocks;
    }

    public static class TeacherBuilder {
        private String firstName;
        private String lastName;
        private List<String> blocks;

        public TeacherBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public TeacherBuilder setBlocks(List<String> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
}
