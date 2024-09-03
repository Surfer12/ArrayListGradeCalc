import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class GradeBook {
    private final List<Student> students;

    public GradeBook(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double calculateClassAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.calculateAverage();
        }
        return total / students.size();
    }
}