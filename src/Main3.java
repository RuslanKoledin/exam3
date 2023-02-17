import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Student student = new Student();

        Student student1 = new Student("Bob",1,1,4,2);
        Student student2 = new Student("Tom",1,2,2,5);
        Student student3 = new Student("Sam",1,4,3,2);


        LinkedList<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        public void removeStudentsByAverageGrade(LinkedList<Student> students) {
            if (student.getAvgGrade() < 3) {
                student.remove(student);
            } else if (student.getAvgGrade() >= 3) {
                System.out.println("mark => 3");
            } else {
                System.out.println("mark > 3");
            }
        }

    }
}
