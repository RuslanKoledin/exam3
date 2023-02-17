import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int courses;
    private int math;
    private int geography;

    public Student(String name, int group, int courses, int math, int geography) {
        this.name = name;
        this.group = group;
        this.courses = courses;
        this.math = math;
        this.geography = geography;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }


    public int getAvgGrade() {
        return (math + geography) / 2;
    }



    public static void removeStud() {
    }

    public static void printStudents(LinkedList<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourses() == course) {
                System.out.println(s.getName() + " учится на " + course + " курсе.");
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", courses=" + courses +
                ", math=" + math +
                ", geography=" + geography +
                '}';
    }
}
