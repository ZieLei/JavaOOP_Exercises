package course;

public class Course {
    
    private String courseName, instructor;
    private int credits;

    public Course(String courseName, String instructor, int credits){
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails(){
        System.out.println("Course name: " + courseName + ", Course instructor: " + instructor + ", Course Credits: " + credits);

    }

}
