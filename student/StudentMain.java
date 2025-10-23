package student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");

        s1.addCourse("Math", 95.0);
        s1.addCourse("Physics", 88.5);
        s1.addCourse("History", 92.0);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Courses and Grades:");
        for (String course : s1.getCourses().keySet()) {
            System.out.println(" - " + course + ": " + s1.getGrade(course));
        }
    }
}

