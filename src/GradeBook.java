// src/GradeBook.java

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
    private ArrayList<Student> students = new ArrayList<>();

    public void getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            String name = InputReaders.getStudentName(scanner);
            // Assuming other details are also read here
            students.add(new Student(name, 0, "", 0, "", false, "", "", new String[]{}, 0, 0, 0, 0, 0));
        }
    }

    public void getGrades() {
        Scanner scanner = new Scanner(System.in);
        for (Student student : students) {
            System.out.println("Enter grades for " + student.getName() + ":");
            InputReaders.readAssignmentScores(scanner, student);
        }
    }

    public void calculateAverages() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        for (Student student : students) {
            double average = gradeCalculator.calculateAverage(student);
            student.setAverage(average);
        }
    }

    public void displayResults() {
        for (Student student : students) {
            char grade = GradeCalculator.determineFinalGrade(student.getAverage());
            ResultDisplayer.displayResults(student.getName(), student.getAverage(), grade);
        }
    }
}