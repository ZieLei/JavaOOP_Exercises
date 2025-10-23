package student;

import java.util.HashMap;

public class Student {

    private String name;
    private HashMap<String, Double> courses; 

    public Student(String name) {
        this.name = name;
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, double grade) {
        courses.put(courseName, grade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getGrade(String courseName) {
        return courses.get(courseName);
    }

    public HashMap<String, Double> getCourses() {
        return courses;
    }
}
