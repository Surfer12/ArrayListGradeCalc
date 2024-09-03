// src/GradeArray.java

import java.util.ArrayList;
import java.util.Scanner;

public class GradeArray {
    public static void createStudentGradesArray() {
        ArrayList<Integer> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            Student student = new Student();
            InputReaders.readAssignmentScores(scanner, student);
            studentGrades.add(student.getTotalScore());
        }
        System.out.println("Student grades: " + studentGrades);
    }
}