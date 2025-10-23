package school;

import java.util.ArrayList;

public class School {
    private ArrayList<String> teachers;
    private ArrayList<String> students;
    private ArrayList<String> classes;
    //do I make the constructor perimeter arraylists?? 
    public School(){
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addTeachers(String teacher){
        teachers.add(teacher);
    }

    public void addStudents(String student){
        students.add(student);
    }

    public void addClasses(String className){
        classes.add(className);
    }

    public void removeTeacher(String teacher){
        teachers.remove(teacher);
    }

    public void removeStudent(String student){
        teachers.remove(student);
    }

    public void removeClass(String className){
        classes.remove(className);
    }

    public void showAllTeachers(){
        System.out.println();
        System.out.println("Teachers: ");
        for (String teachers : teachers){
            System.out.println(teachers);
        }
    }

    public void showAllStudents(){
        System.out.println();
        System.out.println("Students: ");
        for (String students : students){
            System.out.println(students);
        }
    }

    public void showAllClasses(){
        System.out.println();
        System.out.println("Classes: ");
        for (String classes : classes){
            System.out.println(classes);
        }
    }
}
