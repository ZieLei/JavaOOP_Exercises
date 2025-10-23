package school;

public class SchoolMain {
    public static void main(String[] args) {
        School legacy = new School();

        legacy.addTeachers("John Doe");
        legacy.addTeachers("Juan Pedro");
        legacy.addStudents("RmenJhyd Glodobe");
        legacy.addStudents("JhymdrenMG");
        legacy.addClasses("Math");
        legacy.addClasses("Science");

        legacy.showAllTeachers();
        legacy.showAllStudents();
        legacy.showAllClasses();

        legacy.removeTeacher("John Doe");
        legacy.removeStudent("JhymdrenMG");
        legacy.removeClass("Science");

        legacy.showAllTeachers();
        legacy.showAllStudents();
        legacy.showAllClasses();
    }
}
